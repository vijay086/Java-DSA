import java.util.Scanner;

class Employeee {
    // Data members
    protected String name;
    protected int empNumber;
    protected char gender;

    // Method to input data
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name:");
        name = scanner.nextLine();
        System.out.print("Enter employee number:");
        empNumber = scanner.nextInt();
        System.out.print("Enter gender (M/F):");
        gender = scanner.next().charAt(0);
    }

    // Method to display data
    public void showData() {
        System.out.println("Name: " + name);
        System.out.println("Employee Number: " + empNumber);
        System.out.println("Gender: " + gender);
    }
}

class SalariedEmployee extends Employeee {
    // New data member
    private double salary;

    // Constructor
    public SalariedEmployee() {
        super(); // calling base class constructor
    }

    // Method to input data
    public void inputData() {
        super.inputData(); // calling base class method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter salary:");
        salary = scanner.nextDouble();
    }

    // Method to calculate allowance and display gross salary
    public void allowance() {
        double HRA, DA;
        if (gender == 'F') {
            HRA = 0.1 * salary;
        } else {
            HRA = 0.09 * salary;
        }
        DA = 0.05 * salary;
        double grossSalary = salary + HRA + DA;
        System.out.println("Gross Salary: " + grossSalary);
    }

    // Method to increment salary
    public void increment() {
        salary = salary + 0.1 * salary;
    }
}

public class Employee2 {
    public static void main(String[] args) {
        SalariedEmployee employee = new SalariedEmployee();
        employee.inputData();
        employee.allowance();
        employee.increment();
    }
}
