package pojos;

public class MedicalHistory {

    private Double fev1Fvc;
    private Double temperature;
    private Integer respiratoryRate;

    public MedicalHistory(Double fev1Fvc, Double temperature, Integer respiratoryRate) {
        this.fev1Fvc = fev1Fvc;
        this.temperature = temperature;
        this.respiratoryRate = respiratoryRate;
    }

    public MedicalHistory() {
    }

    public void setFev1Fvc(Double fev1Fvc) {
        this.fev1Fvc = fev1Fvc;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public void setRespiratoryRate(Integer respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public Double getFev1Fvc() {
        return fev1Fvc;
    }

    public Double getTemperature() {
        return temperature;
    }

    public Integer getRespiratoryRate() {
        return respiratoryRate;
    }
}
