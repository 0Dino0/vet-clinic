package main.java.com.magicvet;

import java.util.regex.Pattern;

public class Client {

    String firstName;
    String lastName;
    String email;

    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z-]{3,}$");

    public void setFirstName(String firstName) {
        if (!NAME_PATTERN.matcher(firstName).matches()) {
            System.out.println("The first name " + firstName + " does not meet the criteria. See the instructions.");
        } else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (!NAME_PATTERN.matcher(lastName).matches()) {
            System.out.println("The last name " + lastName + " does not meet the criteria. See the instructions.");
        } else {
            this.lastName = lastName;
        }
    }
}
