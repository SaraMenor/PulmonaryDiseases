package services;

import pojos.*;
import java.util.ArrayList;
import java.util.List;

public class SymptomSuggester {

    public List<SymptomType> suggestSymptoms(Patient patient) {
        List<SymptomType> suggestions = new ArrayList<>();

        // Smocking risks
        if (patient.isSmoker()) {
            suggestions.add(SymptomType.PRODUCTIVE_COUGH);
            suggestions.add(SymptomType.SHORTNESS_OF_BREATH);
            suggestions.add(SymptomType.FATIGUE);
        }

        // Sympotm suggestions based on the age
        if (patient.getAge() > 50) {
            suggestions.add(SymptomType.CHEST_PAIN);
            suggestions.add(SymptomType.WEIGHT_LOSS); // lung cancer red flag
        }

        // Asthma patterns in young adults
        if (patient.getAge() < 30) {
            suggestions.add(SymptomType.WHEEZING);
            suggestions.add(SymptomType.DRY_COUGH);
        }

        // Occupational exposure
        String occupation = patient.getOccupation() == null ? "" : patient.getOccupation().toLowerCase();

        if (occupation.contains("construction") || occupation.contains("miner") || occupation.contains("factory")) {
            suggestions.add(SymptomType.FATIGUE);
            suggestions.add(SymptomType.DRY_COUGH);  // dust exposure
            suggestions.add(SymptomType.SHORTNESS_OF_BREATH);
        }

        // Other pathologies inlfuence
        if (patient.getOtherDiseases() != null) {
            if (patient.getOtherDiseases().contains(OtherDiseases.ASTHMA)) {
                suggestions.add(SymptomType.WHEEZING);
                suggestions.add(SymptomType.DRY_COUGH);
            }
        }

        return suggestions;
    }
}
