package ex3;

/**
 * Created by Denis on 24.11.2016.
 */
public class Human {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s, telephone number: %s, address: %s", firstName, lastName, phoneNumber, address);
    }
}
