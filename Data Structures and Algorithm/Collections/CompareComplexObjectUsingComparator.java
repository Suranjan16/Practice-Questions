import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CompareComplexObjectUsingComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Person> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int age = sc.nextInt();

            Person p = new Person(id, name, age);
            list.add(p);
        }

        A a = new A();
        Collections.sort(list, a);
        System.out.println(list);
    }
}

class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}

class A implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        if(p1.getAge() > p2.getAge()) {
            return 1;
        } else if(p1.getAge() < p2.getAge()) {
            return -1;
        } else {
            return 1;
        }
    }
}
