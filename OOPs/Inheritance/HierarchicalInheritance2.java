
public class HierarchicalInheritance2 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Sayan";
        p.id = 101;
        p.displayDetails();

        Student st = new Student();
        st.name = "Sumit";
        st.id = 102;
        st.grade = "A";
        st.displayDetails();

        Teacher t = new Teacher();
        t.name = "Suranjan";
        t.id = 1001;
        t.department = "Science";
        t.displayDetails();
    }
}

class Person {
    String name;
    int id;

    void displayDetails() {
       System.out.println("User id: " + id + ", Name: " + name);
    }
}

class Student extends Person {
    String grade;

    @Override
    void displayDetails() {
        System.out.println("User id: " + id + ", Name: " + name + ", Grade: " + grade);
    }
}
class Teacher extends Person {
    String department;

    @Override
    void displayDetails() {
        System.out.println("User id: " + id + ", Name: " + name + ", Department: " + department);
    }
}
