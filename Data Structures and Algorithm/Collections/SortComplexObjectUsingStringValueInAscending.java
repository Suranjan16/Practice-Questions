import java.util.ArrayList;
import java.util.Collections;
// import java.util.Objects;

public class SortComplexObjectUsingStringValueInAscending {
    public static void main(String[] args) {
        Student s1 = new Student(5, "Amit", 7.8);
        Student s2 = new Student(4, "Sumit", 6.8);
        Student s3 = new Student(3, "Parmit", 9.8);
        Student s4 = new Student(2, "Amitava", 8.8);

        ArrayList<Student> list = new ArrayList<>();
        list.add(s4);
        list.add(s3);
        list.add(s2);
        list.add(s1);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}

class Student implements Comparable<Student> {
    int roll;
    String name;
    double cgpa;
    public Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + ", cgpa=" + cgpa + "]";
    }
    // @Override
    // public int hashCode() {
    //     return Objects.hash(roll,name, cgpa);
    // }
    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     else 
    //         return false;
    // }
    
    
    //for make the list descending logic would be just opposite
    @Override
    public int compareTo(Student obj) {
       return this.name.compareTo(obj.name);
    }
}
