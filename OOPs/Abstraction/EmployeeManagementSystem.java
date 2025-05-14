public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e = new Employee(1,"Suranjan", "IT");
        e.displayDetails();
        Employee e1 = new Employee(2,"Sumit", "Non-IT");
        e1.displayDetails();
        Employee e2 = new Employee(3,"Suchayan", "Support");
        e2.displayDetails();

    }
}

class Employee {
    int empId;
    String empName;
    String empDepartment;

    public Employee(int e, String n, String d) {
        empId = e;
        empName = n;
        empDepartment = d;
    }

    void displayDetails() {
        System.out.println("Name: " + empName);
        System.out.println("Id: " + empId);
        System.out.println("Department: " + empDepartment);
    }
}
