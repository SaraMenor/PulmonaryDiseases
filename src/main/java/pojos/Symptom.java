package pojos;

public class Symptom {

    private SymptomType type;
    private boolean present;

    public Symptom(SymptomType type, boolean present) {
        this.type = type;
        this.present = present;
    }

    public SymptomType getType() {
        return type;
    }

    public boolean isPresent() {
        return present;
    }
}
