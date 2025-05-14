public class Constructors1 {
    public static void main(String[] args) {
        Student st1 = new Student(1,"Suranjan",2024,7.5,24);
        st1.displayDetails();
        Student st2 = new Student(2,"Sumit",2018,8.5,28);
        st2.displayDetails();
       
    }
}

class Student {
    int id;
    String name;
    int yop;
    double cgpa;
    int age;

    public Student(int a, String n, int y, double c, int b) {
        id = a;
        name = n;
        yop = y;
        cgpa = c;
        age = b;
    }

    void displayDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Year of Passout: " + yop);
        System.out.println("Cgpa: " + cgpa);
        System.out.println("Age: " + age);
    }
}