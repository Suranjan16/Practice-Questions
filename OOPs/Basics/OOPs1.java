
public class OOPs1 {
    public static void main(String[] args) {
        Student st = new Student();

        // initialized values of states
        st.name = "Suranjan Maity";
        st.roll = 01;
        st.age = 23;
        st.cgpa = 8.5;
        st.yearOfPassout = 2024;

        // accessing behaviours
        st.giveAttendance();
        st.attendClass();
        st.displayDetails();
    }
}

class Student {
    // state or properties of an object
    String name;
    int roll;
    int age;
    double cgpa;
    int yearOfPassout;
   
    // Behaviours of an Object 
   
    public void giveAttendance() {
        System.out.println("Student gives attendance!");
    }

    public void attendClass() {
        System.out.println("Students attend classes.");
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + roll);
        System.out.println("CGPA: " + cgpa);
        System.out.println("YEAR OF PASSOUT: " + yearOfPassout);
    }
}