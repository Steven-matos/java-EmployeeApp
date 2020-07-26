package employeeApp;

public class Company {

    private static int maxId = 0;

    // Don't do this. (Poor practice now in days)
    // With public you dont have to do Getters and Setters
    // You loose control of the state.
    public int id;
    public String name;
    public int debt;

    public Company(String name, int debt) {
        maxId++;
        id = maxId;
        this.name = name;
        this.debt = debt;
    }

    @Override
    public String toString() {
        return "Company: " + name + " debt: " + debt;
    }
}