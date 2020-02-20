package domain;

import com.google.gson.annotations.SerializedName;

public class Person {
    @SerializedName(value = "full-name",alternate = "firstName")
    String firstName;
    @SerializedName(value = "last-name",alternate = "lastName")
    String lastName;
    @SerializedName(value = "year",alternate = "birthYear")
    int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
