public class MethodHidingInCompanyHierarchi {
    public static void main(String[] args) {
        Person.display(); // Person is working.
        Employee.display(); // Employee is working.
        Manager.display(); // Manager is working.
    }    
}

class Person {
    static void display() {
        System.out.println("Person is working.");
    }
}

class Employee extends Person {
    static void display() {
        System.out.println("Employee is working.");
    }
}

class Manager extends  Employee {
    static void display() {
        System.out.println("Manager is working.");
    }
}