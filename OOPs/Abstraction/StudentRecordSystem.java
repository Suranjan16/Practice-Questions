public class StudentRecordSystem {
    public static void main(String[] args) {
        Student a = new Student("CSE", "Kodnest");
        Student s = new Student(a,"Dutta", 24,3);
        s.displayDetails();
    }
}

class Student {
    String name;
    int age;
    int roll;
    String branch;     
    String institute;     
    
    public Student(String branch, String institute) {
        this.branch = branch;
        this.institute = institute;
    }
    public Student(Student st, String name, int age, int roll) {
        this.branch = st.branch;
        this.institute = st.institute;
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    public void displayDetails() {
        System.out.println("Name:  " + name);
        System.out.println("Age:  " + age);
        System.out.println("Roll:  " + roll);
        System.out.println("Branch:  " + branch);
        System.out.println("Institute: " + institute);
    }
}
