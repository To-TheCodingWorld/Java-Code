package in.EmployeeDetails;

public class TestEmployee {
    public static void main(String[] args) {
        System.out.println("Welcome to the employee details....");
        Employee emp = new Employee("MAHABIR",23,36000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("SHUBHANKAR");
        emp.setSalary(25000);
        System.out.println(emp.getEmployeeDetails());
    }
}
