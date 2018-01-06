package ro.springhotel.hotel.domain;

import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

/**
 * @author Dani
 */
public class Client extends AbstractModel {

    private long id;
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

//    public Client(String userName, String password, float budget, boolean hasCar, boolean hasPet) {
//        this.userName = userName;
//        this.password = password;
//        this.budget = budget;
//        this.hasCar = hasCar;
//        this.hasPet = hasPet;
//    }

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
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (id != client.id) return false;
        if (Float.compare(client.budget, budget) != 0) return false;
        if (hasCar != client.hasCar) return false;
        if (hasPet != client.hasPet) return false;
        if (userName != null ? !userName.equals(client.userName) : client.userName != null) return false;
        if (password != null ? !password.equals(client.password) : client.password != null) return false;
        if (firstName != null ? !firstName.equals(client.firstName) : client.firstName != null) return false;
        if (lastName != null ? !lastName.equals(client.lastName) : client.lastName != null) return false;
        if (gender != client.gender) return false;
        return birthDate != null ? birthDate.equals(client.birthDate) : client.birthDate == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (budget != +0.0f ? Float.floatToIntBits(budget) : 0);
        result = 31 * result + (hasCar ? 1 : 0);
        result = 31 * result + (hasPet ? 1 : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        return result;
    }
}
