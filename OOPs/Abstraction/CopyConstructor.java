public class CopyConstructor {
    public static void main(String[] args) {
        Student s = new Student("Kodnest", "CSE", 2024);
        Student s1 = new Student(s, "Suranjan",24, 7.66);
        s1.displayDetails();
        Student s2 = new Student(s, "Sumit",28, 8.66);
        s2.displayDetails();
    }
}

class Student {
    String name;
    int age;
    String branch;
    int yop;
    double cgpa;
    String institute;

    public Student(String institute, String branch, int yop) {
        this.institute = institute;
        this.branch = branch;
        this.yop = yop;
    }

    public Student(Student st, String name, int age, double cgpa) {
        this.institute = st.institute;
        this.branch = st.branch;
        this.yop = st.yop;
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
        System.out.println("Year of Passout: " + yop);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Institute: " + institute);
    }
}
