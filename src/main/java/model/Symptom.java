package model;

public class Symptom {

    private boolean cough;
    private boolean productiveCough;
    private boolean dryCough;

    private boolean wheezing;
    private boolean dyspnea;
    private boolean chestPain;

    private boolean fever;
    private boolean hemoptysis;
    private boolean fatigue;
    private boolean weightLoss;

    public Symptom() {}


    public boolean isCough() {
        return cough;
    }

    public void setCough(boolean cough) {
        this.cough = cough;
    }

    public boolean isProductiveCough() {
        return productiveCough;
    }

    public void setProductiveCough(boolean productiveCough) {
        this.productiveCough = productiveCough;
    }

    public boolean isDryCough() {
        return dryCough;
    }

    public void setDryCough(boolean dryCough) {
        this.dryCough = dryCough;
    }

    public boolean isWheezing() {
        return wheezing;
    }

    public void setWheezing(boolean wheezing) {
        this.wheezing = wheezing;
    }

    public boolean isDyspnea() {
        return dyspnea;
    }

    public void setDyspnea(boolean dyspnea) {
        this.dyspnea = dyspnea;
    }

    public boolean isChestPain() {
        return chestPain;
    }

    public void setChestPain(boolean chestPain) {
        this.chestPain = chestPain;
    }

    public boolean isFever() {
        return fever;
    }

    public void setFever(boolean fever) {
        this.fever = fever;
    }

    public boolean isHemoptysis() {
        return hemoptysis;
    }

    public void setHemoptysis(boolean hemoptysis) {
        this.hemoptysis = hemoptysis;
    }

    public boolean isFatigue() {
        return fatigue;
    }

    public void setFatigue(boolean fatigue) {
        this.fatigue = fatigue;
    }

    public boolean isWeightLoss() {
        return weightLoss;
    }

    public void setWeightLoss(boolean weightLoss) {
        this.weightLoss = weightLoss;
    }
}
