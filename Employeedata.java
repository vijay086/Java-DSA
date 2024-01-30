class Employee {
    // Instance variables
    private int employeeCode;
    private String name;
    private String designation;
    private double basicPay;

    // Constructor
    public Employee(int employeeCode, String name, String designation, double basicPay) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.designation = designation;
        this.basicPay = basicPay;
    }

    // Method to calculate HRA
    public double calculateHRA() {
        return 0.10 * basicPay;
    }

    // Method to calculate DA
    public double calculateDA() {
        return 0.45 * basicPay;
    }

    // Method to calculate total pay
    public double calculateTotalPay() {
        return basicPay + calculateHRA() + calculateDA();
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Code: " + employeeCode);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + calculateHRA());
        System.out.println("DA: " + calculateDA());
        System.out.println("Total Pay: " + calculateTotalPay());
        System.out.println();
    }
}

public class Employeedata {
    public static void main(String[] args) {
        // Create objects for three different employees
        Employee employee1 = new Employee(101, "vijay ahir", "Manager", 50000.0);
        Employee employee2 = new Employee(102, "lux ahir", "Engineer", 40000.0);
        Employee employee3 = new Employee(103, "siddhant soni", "Analyst", 30000.0);

        // Calculate and display details for each employee
        System.out.println("Employee 1 Details:");
        employee1.displayDetails();

        System.out.println("Employee 2 Details:");
        employee2.displayDetails();

        System.out.println("Employee 3 Details:");
        employee3.displayDetails();
    }
}
