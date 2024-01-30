
    public class Person {
        // Instance variables
        private String name;
        private int age;
        private double salary;

        // Constructor
        public Person(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        // Getter and setter methods
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        // Display method
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
        }

        public static void main(String[] args) {
            // Creating a Person object using the new operator
            Person person = new Person("vijay", 19, 0.0);

            // Displaying instance variables
            person.displayInfo();
        }
    }


