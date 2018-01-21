package ro.springhotel.hotel.domain;

import ro.springhotel.hotel.web.HomepageController;

import java.util.Date;

/**
 * @author Dani
 */
public class Client extends AbstractModel {

    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Gender gender;
    private float budget;
    private boolean hasCar;
    private boolean hasPet;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public float getBudget() {
        return budget;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public boolean isHasPet() {
        return hasPet;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    public void setHasPet(boolean hasPet) {
        this.hasPet = hasPet;
    }

    @Override
    public String toString() {
        return "Client{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", budget=" + budget +
                ", hasCar=" + hasCar +
                ", hasPet=" + hasPet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (Float.compare(client.budget, budget) != 0) return false;
        if (hasCar != client.hasCar) return false;
        if (hasPet != client.hasPet) return false;
        if (userName != null ? !userName.equals(client.userName) : client.userName != null) return false;
        if (password != null ? !password.equals(client.password) : client.password != null) return false;
        if (firstName != null ? !firstName.equals(client.firstName) : client.firstName != null) return false;
        if (lastName != null ? !lastName.equals(client.lastName) : client.lastName != null) return false;
        if (birthDate != null ? !birthDate.equals(client.birthDate) : client.birthDate != null) return false;
        return gender == client.gender;
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (budget != +0.0f ? Float.floatToIntBits(budget) : 0);
        result = 31 * result + (hasCar ? 1 : 0);
        result = 31 * result + (hasPet ? 1 : 0);
        return result;
    }

}


