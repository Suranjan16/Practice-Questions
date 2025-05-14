public class InstanceBlock {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.displayInfo();
        Employee e1 = new Employee("Suranjan");
        e1.displayInfo();
        Employee e2 = new Employee("Sayan",35,3445);
        e2.displayInfo();
    }
}

class Employee {
    String name;
    int age;
    int id;
    static {
        System.out.println("Instance block called.");
    }

    public Employee(String name) {
        this.name = name;
        System.out.println("1 parameter constructor called");
    }
    public Employee() {
        System.out.println("0 parameter constructor called");
    }
    public Employee(String name, int age, int id) {
        this.name = name;
        this.id = id;
        this.age = age;
        System.out.println("Constructor is called.");
    }
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }

    static {
        System.out.println("Static block called.");
    }
}