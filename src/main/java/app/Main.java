package app;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import pojos.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // LOAD DROOLS
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("pulmonaryKS");


        // CREATE PATIENT
        Patient patient = new Patient();
        patient.setAge(65);
        patient.setGender(Gender.MALE);
        patient.setSmoker(true);
        patient.setOccupation("office");

        // PREVIOUS DISEASES
        List<OtherDiseases> prevDis = new ArrayList<>();
        prevDis.add(OtherDiseases.COPD);
        patient.setOtherDiseases(prevDis);

        ksession.insert(patient);


        // ADD SYMPTOMS (INDEPENDENT OBJECTS)

        ksession.insert(new Symptom(SymptomType.PRODUCTIVE_COUGH, true));
        ksession.insert(new Symptom(SymptomType.SHORTNESS_OF_BREATH, true));
        ksession.insert(new Symptom(SymptomType.WHEEZING, true));
        ksession.insert(new Symptom(SymptomType.FATIGUE, true));


        // MEDICAL HISTORY
        MedicalHistory mh = new MedicalHistory();
        mh.setFev1Fvc(0.65);
        mh.setTemperature(37.4);
        mh.setRespiratoryRate(18);
        ksession.insert(mh);

        // FIRE DROOLS PHASES IN ORDER
        runPhase(ksession, "risk-assessment");
        runPhase(ksession, "symptom-analysis");
        runPhase(ksession, "physiology-check");
        runPhase(ksession, "diagnosis");

        ksession.dispose();
    }

    private static void runPhase(KieSession ksession, String group) {
        ksession.getAgenda().getAgendaGroup(group).setFocus();
        ksession.fireAllRules();
    }
}
