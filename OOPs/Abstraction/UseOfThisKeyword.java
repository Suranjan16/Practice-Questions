public class UseOfThisKeyword {
    public static void main(String[] args) {
        Student st = new Student("Suranjan", 24, 11, "Cse");
        st.displayDetails();
    }
}

class Student {
    String name;
    int age;
    int rollNo;
    String department;

    public Student(String name, int age, int rollNo, String department) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("RollNo: " + rollNo);
        System.out.println("Department: " + department);
    }
}