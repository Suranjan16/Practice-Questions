

public class EmployeeManagement {

    public static void main(String[] args) {
        Manager mg = new Manager();
        mg.name = "Suranjan";
        mg.id = 101;
        mg.teamSize = 19;
        mg.work();
        mg.introduce();
        mg.manage();
    }
}

class Person {
    String name;
    void work() {
        System.out.println("My name is: " + name);
    }
}

class Employee extends Person {
    int id;
    void introduce() {
        System.out.println("My id is: " + id);
    }
}

class Manager extends  Employee {
    int teamSize;
    void manage() {
        System.out.println("There are " + teamSize + " members in our team.");
    }
}