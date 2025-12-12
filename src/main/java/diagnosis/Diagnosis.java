package diagnosis;

public class Diagnosis {

    private String disease;
    private String medicalExplanation;

    public Diagnosis() {
    }

    public Diagnosis(String name, String medicalExplanation) {
        this.disease = name;
        this.medicalExplanation = medicalExplanation;
    }

    public String getName() {
        return disease;
    }

    public void setName(String name) {
        this.disease = name;
    }

    public String getMedicalExplanation() {
        return medicalExplanation;
    }

    public void setMedicalExplanation(String medicalExplanation) {
        this.medicalExplanation = medicalExplanation;
    }

}
