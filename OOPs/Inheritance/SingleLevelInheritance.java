

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Professor p = new Professor(); 
        p.name = "Suranjan Maity";
        p.department = "CSE";
        p.inroduce();
        p.conductLecture();
    }
}

class Person {
    String name; 
    void inroduce() {
        System.out.println("Hello, my name is " + name + ".");
    }
}

class Professor extends Person {
    String department;
    void conductLecture() {
        System.out.println(name +" , " + department + " is conducting lecture.");
    }
}
