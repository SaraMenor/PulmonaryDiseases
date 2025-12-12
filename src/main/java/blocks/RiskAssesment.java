package blocks;

public class RiskAssesment {
    private boolean highSmokingRisk;
    private boolean occupationalRisk;
    private boolean infectionRisk;

    public RiskAssesment() {
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

    public void setInfectionRisk(boolean increasedInfectionRisk) {
        this.infectionRisk = infectionRisk;
    }
}
