

public class HybridInheritance {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Suranjan Maity";
        p.age = 20;
        p.display();

        Student s = new Student();
        s.name = "Suranjan Maity";
        s.age = 20;
        s.studentId = "S12345";
        s.display();

        Teacher t = new Teacher();
        t.name = "Sayan Maity";
        t.age = 30;
        t.teacherId = "T12345";
        t.display();

        HeadTeacher ht = new HeadTeacher();
        ht.name = "Sumit Maity";
        ht.age = 40;
        ht.headTeacherId = "HT12345";
        ht.display();

        GraduateStudent gs = new GraduateStudent();
        gs.name = "Soumen Maity";
        gs.age = 2;
        gs.studentId = "S54321";
        gs.graduationYear = "2023";
        gs.display();
    }
}

class Person {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: "  + age);
    }
}

class Student extends Person {
    String studentId;
    @Override
    void display() {
        System.out.println("Name: " + name + ", Age: "  + age + ", Student ID: " + studentId);
    }
}

class Teacher extends Person {
    String teacherId;
    @Override
    void display() {
    System.out.println("Name: " + name + ", Age: "  + age + ", Teacher ID: " + teacherId);
    }
}

class HeadTeacher extends Teacher {
    String headTeacherId;

    @Override
    void display() {
        System.out.println("Name: " + name + ", Age: "  + age + ", HeadTeacher ID: " + headTeacherId);
    }
}

class GraduateStudent extends Student {
    String graduationYear;

    @Override
    void display() {
        System.out.println("Name: " + name + ", Age: "  + age + ", Student ID: " + studentId + ", Graduation Year: " + graduationYear);
    }
}