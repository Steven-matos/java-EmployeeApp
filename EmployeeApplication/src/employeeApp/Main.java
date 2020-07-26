package employeeApp;

public class Main {
    private static void workWithData() {
        System.out.println("Welcome to Lambda School's Java!");

        Healthplan h1 = new Healthplan("My Health 1");
        Healthplan h2 = new Healthplan("My Health 2");

        Company c1 = new Company("Company A", 100);
        Company c2 = new Company("Company B", 100);

        Employee emp1 = new Employee("Steven", "Matos", 104000, true, c1.id, h1.getId());
        Employee emp2 = new Employee("Jane", "Doe", 80000, true, c1.id, h2.getId());
        Employee emp3 = new Employee("Leia", "Matos", 40000, false, c2.id, h1.getId());

        System.out.println(c1);

        emp1.setSalary(emp1.getSalary() + 500); // double
        System.out.println(emp1.getFname() + " " + emp1.getSalary());

        System.out.println(c1.debt / 7); // Int
        System.out.println(c1.debt % 7); // Int
        System.out.println(c1.debt / 7.0); // double

        double result = (double) c1.debt / 14; // double
        System.out.println(result);
    }
    public static void main(String[] args){
        workWithData();
    }
}