import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortComplexObjectUsingIntValueAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many object you want to store: ");
        int n = sc.nextInt();

        ArrayList<Student> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            int r = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            Student s1 = new Student(r, s);
            list.add(s1);
        }

        System.out.println(list);
        Collections.sort(list);
        System.out.println("Sorted list based on roll no: ");
        for(Student s2: list) {
            System.out.println(s2);
        }
    }
}

class Student implements Comparable<Student> {
    private int roll;
    private String name;
   
    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + "]";
    }
    
    // for make it descending order logic will be just opposite
    public int compareTo(Student s) {
        if(this.roll > s.roll)
           return 1; 
        else if(this.roll < s.roll) 
           return -1;
        else 
           return 0;
    }
}
