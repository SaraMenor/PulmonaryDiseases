package pojos;

public class Diagnosis {

    private String name;
    private String medicalExplanation;

    public Diagnosis(String name, String medicalExplanation) {
        this.name = name;
        this.medicalExplanation = medicalExplanation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalExplanation() {
        return medicalExplanation;
    }

    public void setMedicalExplanation(String medicalExplanation) {
        this.medicalExplanation = medicalExplanation;
    }

    @Override
    public String toString() {
        return "Diagnosis: " + name + " (" + medicalExplanation + ")";
    }
}
