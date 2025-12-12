package model;

public class RiskFactor {
    private boolean smoker;

    private boolean occupationalExposure;
    private boolean hasChronicDisease; //dibates

    public RiskFactor() {
    }

    public boolean isSmoker() {
        return smoker;
    }

    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }

    public boolean isOccupationalExposure() {
        return occupationalExposure;
    }

    public void setOccupationalExposure(boolean occupationalExposure) {
        this.occupationalExposure = occupationalExposure;
    }

    public boolean isHasChronicDisease() {
        return hasChronicDisease;
    }

    public void setHasChronicDisease(boolean hasChronicDisease) {
        this.hasChronicDisease = hasChronicDisease;
    }
}
