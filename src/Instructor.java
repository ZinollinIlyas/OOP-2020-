
import java.io.*;
import java.util.*;

public class Instructor implements Serializable {
    public String firstName;
    public String lastName;
    public String department;
    public String email;

    public Instructor(String firstName, String lastName, String department, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.email = email;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }





    @Override
    public String toString() {
        return lastName + " " + firstName + " from " + department + " department" + ", email : " + email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Instructor instructor = (Instructor) o;
        return firstName.equals(instructor.firstName)
                && lastName.equals(instructor.lastName)
                && department.equals(instructor.department)
                && email.equals(instructor.email);
    }






}