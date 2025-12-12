package model;

public class Patient {
    private int id;
    private int age;
    private Gender gender;

    //blocks
    private RiskFactor riskFactor;
    private Symptom symptom;
    private Physiology physiology;

    public Patient() {
    }

    public Patient(int id, int age, Gender gender) {
        this.id = id;
        this.age = age;
        this.gender = gender;
    }
    public Patient(int id, int age, Gender gender, RiskFactor riskFactor, Symptom symptom, Physiology physiology) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.riskFactor = riskFactor;
        this.symptom = symptom;
        this.physiology = physiology;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public RiskFactor getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(RiskFactor riskFactor) {
        this.riskFactor = riskFactor;
    }

    public Symptom getSymptom() {
        return symptom;
    }

    public void setSymptom(Symptom symptom) {
        this.symptom = symptom;
    }

    public Physiology getPhysiology() {
        return physiology;
    }

    public void setPhysiology(Physiology physiology) {
        this.physiology = physiology;
    }
}
