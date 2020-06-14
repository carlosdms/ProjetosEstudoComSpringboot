package Silva.Carlos.exemplohelloworldclient.model;

/**
 * @author carlos
 * @since 09/06/2020 - 13:22
 * @version 1.0.1
 */
public class Client {

    private String name;
    private String lastName;
    private double income;

    public Client() {
    }

    public Client(String name, String lastName, double income) {
        this.name = name;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double calculateIncome() {
        return this.income * 1.10;
    }
    @Override
    public String toString() {
        return "\nName: " + this.name
             + "\nLastName: " + this.lastName
             + "\nIncome: " + this.income
             + "\nUnhealthy Bonus (+10%): " + this.calculateIncome();
    }
}
