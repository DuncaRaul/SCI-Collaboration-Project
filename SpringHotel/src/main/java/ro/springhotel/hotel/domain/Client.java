package ro.springhotel.hotel.domain;

public class Client {

    private String userName;
    private String password;
    private float budget;
    private boolean hasCar;
    private boolean hasPet;

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

    public String getPassword() {
        return password;
    }

    public float getBudget() {
        return budget;
    }

    public boolean hasCar() {
        return hasCar;
    }

    public boolean hasPet() {
        return hasPet;
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
