package personContact;

import java.util.LinkedList;
public class Person {
    // create firstname of string type
    private String firstName;
    // lastname of string type
    private String lastName;
    // phone number of long type
    private LinkedList<String> phone;
    // email id of string type
    private String emailId;

    //creating constructor
    public Person(String firstName, String lastName, LinkedList<String> phone, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        //creating getter and setter

        this.emailId = emailId;
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

    public LinkedList<String> getPhone() {
        return phone;
    }

    public void setPhone(LinkedList<String> phone) {
        this.phone = phone;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
