package blocks;

public class SymptomPattern {
    private boolean obstructivePattern;
    private boolean infectiousPattern;
    private boolean interstitialPattern;
    private boolean neoplasticPattern;

    public SymptomPattern() {
    }

    public boolean isObstructivePattern() {
        return obstructivePattern;
    }

    public void setObstructivePattern(boolean obstructivePattern) {
        this.obstructivePattern = obstructivePattern;
    }

    public boolean isInfectiousPattern() {
        return infectiousPattern;
    }

    public void setInfectiousPattern(boolean infectiousPattern) {
        this.infectiousPattern = infectiousPattern;
    }

    public boolean isInterstitialPattern() {
        return interstitialPattern;
    }

    public void setInterstitialPattern(boolean interstitialPattern) {
        this.interstitialPattern = interstitialPattern;
    }

    public boolean isNeoplasticPattern() {
        return neoplasticPattern;
    }

    public void setNeoplasticPattern(boolean neoplasticPattern) {
        this.neoplasticPattern = neoplasticPattern;
    }
}
