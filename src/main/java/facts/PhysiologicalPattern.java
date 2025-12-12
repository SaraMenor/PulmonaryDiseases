package facts;

public class PhysiologicalPattern {

    private boolean airflowObstruction;
    private boolean restrictivePattern;
    private boolean lowOxygenLevels;
    private boolean severeRespiratoryFailure;

    public PhysiologicalPattern() {
    }

    public boolean isRestrictivePattern() {
        return restrictivePattern;
    }

    public void setRestrictivePattern(boolean restrictivePattern) {
        this.restrictivePattern = restrictivePattern;
    }

    public boolean isAirflowObstruction() {
        return airflowObstruction;
    }

    public void setAirflowObstruction(boolean airflowObstruction) {
        this.airflowObstruction = airflowObstruction;
    }

    public boolean isLowOxygenLevels() {
        return lowOxygenLevels;
    }

    public void setLowOxygenLevels(boolean lowOxygenLevels) {
        this.lowOxygenLevels = lowOxygenLevels;
    }

    public boolean isSevereRespiratoryFailure() {
        return severeRespiratoryFailure;
    }

    public void setSevereRespiratoryFailure(boolean severeRespiratoryFailure) {
        this.severeRespiratoryFailure = severeRespiratoryFailure;
    }
}
