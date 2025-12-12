package pojos;

import java.util.List;

public class Patient {
    private int age;
    private Gender gender;
    private boolean smoker;
    private List<OtherDiseases> otherDiseases;
    private String occupation; //farmer, office, construction

    public Patient(int age, Gender gender, boolean smoker, List<OtherDiseases> otherDiseases, String occupation) {
        this.age = age;
        this.gender = gender;
        this.smoker = smoker;
        this.occupation = occupation;
        this.otherDiseases=otherDiseases;
    }

    public Patient() {
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

    public boolean isSmoker() {
        return smoker;
    }

    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }

    public List<OtherDiseases> getOtherDiseases() {
        return otherDiseases;
    }

    public void setOtherDiseases(List<OtherDiseases> otherDiseases) {
        this.otherDiseases = otherDiseases;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
