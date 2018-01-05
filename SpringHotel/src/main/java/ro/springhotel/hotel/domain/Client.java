package ro.springhotel.hotel.domain;

import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

/**
 * @author Dani
 */
public class Client extends AbstractModel {

    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private Gender gender;
    private float budget;
    private boolean hasCar;
    private boolean hasPet;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date birthDate;

    public Client(String userName, String password, float budget, boolean hasCar, boolean hasPet) {
        this.userName = userName;
        this.password = password;
        this.budget = budget;
        this.hasCar = hasCar;
        this.hasPet = hasPet;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    public boolean isHasPet() {
        return hasPet;
    }

    public void setHasPet(boolean hasPet) {
        this.hasPet = hasPet;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Client{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", budget=" + budget +
                ", hasCar=" + hasCar +
                ", hasPet=" + hasPet +
                '}';
    }
}
