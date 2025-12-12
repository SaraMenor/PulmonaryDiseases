package facts;

public class RiskAssessment {
    private boolean highSmokingRisk;
    private boolean occupationalRisk;
    private boolean infectionRisk;

    public RiskAssessment() {
    }
    public boolean isHighSmokingRisk() {
        return highSmokingRisk;
    }

    public void setHighSmokingRisk(boolean highSmokingRisk) {
        this.highSmokingRisk = highSmokingRisk;
    }

    public boolean isOccupationalRisk() {
        return occupationalRisk;
    }

    public void setOccupationalRisk(boolean occupationalRisk) {
        this.occupationalRisk = occupationalRisk;
    }

    public boolean isInfectionRisk() {
        return infectionRisk;
    }

    public void setInfectionRisk(boolean infectionRisk) {
        this.infectionRisk = infectionRisk;
    }
}
