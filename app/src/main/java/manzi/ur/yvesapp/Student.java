package manzi.ur.yvesapp;

import io.realm.RealmObject;

public class Student extends RealmObject {
    private int regNumber;
    private String firstName;
    private String lastName;

    public Student() {
    }

    public Student(int regNumber, String firstName, String lastName) {
        this.regNumber = regNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
