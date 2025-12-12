package model;

public class Physiology {

    private Double fev1FvcRatio;
    private Double oxygenSaturation;
    private Double bodyTemperature;
    private Integer respiratoryRate;

    public Physiology() {}

    public Double getFev1FvcRatio() {
        return fev1FvcRatio;
    }

    public void setFev1FvcRatio(Double fev1FvcRatio) {
        this.fev1FvcRatio = fev1FvcRatio;
    }

    public Double getOxygenSaturation() {
        return oxygenSaturation;
    }

    public void setOxygenSaturation(Double oxygenSaturation) {
        this.oxygenSaturation = oxygenSaturation;
    }

    public Double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(Double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public Integer getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(Integer respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }
}
