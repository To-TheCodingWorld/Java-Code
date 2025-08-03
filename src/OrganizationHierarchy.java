// Base class Person
    class Person {
        String name;
        int age;
        String address;

        // Constructor to initialize Person attributes
        public Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        // Method to display Person details
        public void displayPersonDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Address: " + address);
        }
    }

    // Derived class Employee that extends Person
    class Employee extends Person {
        String employeeID;
        String designation;

        // Constructor to initialize Employee attributes
        public Employee(String name, int age, String address, String employeeID, String designation) {
            super(name, age, address); // Call superclass constructor
            this.employeeID = employeeID;
            this.designation = designation;
        }

        // Method to display Employee-specific information
        public void displayEmployeeDetails() {
            displayPersonDetails(); // Call superclass method
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Designation: " + designation);
        }
    }

    // Subclass Manager that extends Employee
    class Manager extends Employee {
        double salary;

        // Constructor to initialize Manager attributes
        public Manager(String name, int age, String address, String employeeID, String designation, double salary) {
            super(name, age, address, employeeID, designation); // Call superclass constructor
            this.salary = salary;
        }

        // Method to calculate salary of the manager
        public void calculateSalary() {
            System.out.println("Salary of the Manager: $" + salary);
        }

        // Display all Manager details
        public void displayManagerDetails() {
            displayEmployeeDetails(); // Call superclass method
            calculateSalary();        // Manager-specific method
        }
    }

    // Main class to demonstrate multilevel inheritance
    public class OrganizationHierarchy {
        public static void main(String[] args) {
            // Create an instance of Manager
            Manager manager = new Manager("Alice Johnson", 35, "123 Green Street", "EMP12345", "IT Manager", 85000);

            // Display all details and invoke methods from all levels
            System.out.println("Manager Details:");
            manager.displayManagerDetails();
        }
    }

