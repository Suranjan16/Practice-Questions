import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CompareComplexObjectUsingComparable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Person> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            Person p = new Person(a, b);
            list.add(p);
        }
        Collections.sort(list);
        System.out.println("Sorted list based on id: ");
        for(Person x: list) {
            System.out.println(x);
        }
    }
}

class Person implements Comparable<Person> {
    private int id;
    private String name;
    
    // Constructor
    public Person(int id, String name) {
       this.id = id;
       this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    // This compareTo method is to compare int, float, double type value field
    @Override
    public int compareTo(Person p) {
        if(p.getId() < this.getId()) {
            return 1;
        } else if(p.getId() > this.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
    // @Override
    // public int compareTo(Person p) {
    //     return (this.name).compareTo(p.name);
    // }

    

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }
    
}
