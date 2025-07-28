import java.util.ArrayList;

public class LowerBoundedWildcard {
    public static void main(String[] args) {
        Employee sd1 = new SeniorDeveloper("Suranjan", 101);
        Employee sd2 = new SeniorDeveloper("Suman", 102);
        Employee sd3 = new SeniorDeveloper("Sumit",103);
        Employee sd4 = new SeniorDeveloper("Sujan", 104);

        ArrayList<Employee> list1 = new ArrayList<>();
        list1.add(sd1);
        list1.add(sd2);
        list1.add(sd3);
        list1.add(sd4);

        JuniorDeveloper jd1 = new JuniorDeveloper("Sukesh", 201);
        JuniorDeveloper jd2 = new JuniorDeveloper("Sumana", 202);
        JuniorDeveloper jd3 = new JuniorDeveloper("Sunabha",203);
        JuniorDeveloper jd4 = new JuniorDeveloper("Sujit", 204);

        ArrayList<JuniorDeveloper> list2 = new ArrayList<>();
        list2.add(jd1);
        list2.add(jd2);
        list2.add(jd3);
        list2.add(jd4);

        Intern i1 = new Intern("Sujoy", 303);
        Intern i2 = new Intern("Sujit", 302);
        Intern i3 = new Intern("Sukumar", 301);

        ArrayList<Intern> list3 = new ArrayList<>();
        list3.add(i1);
        list3.add(i2);
        list3.add(i3);

        display(list1);
        display(list2);
        // display(list3); // it can't be executed because display() can only except Junior developer and its superclass
    }

    public static void display(ArrayList<? super JuniorDeveloper> list) {
        System.out.println("List: " + list);
        System.out.println("Employee count: " + list.size());
    }
}

class Employee {

}

class SeniorDeveloper extends Employee {
    String name;
    int empId;

    public SeniorDeveloper(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "SeniorDeveloper [name=" + name + ", empId=" + empId + "]";
    }
}
class JuniorDeveloper extends SeniorDeveloper {

    public JuniorDeveloper(String name, int empId) {
        super(name, empId); // call parent constructor
    }

    @Override
    public String toString() {
        return "JuniorDeveloper [name=" + name + ", empId=" + empId + "]";
    }
}


class Intern extends JuniorDeveloper {
    int internId;

    public Intern(String name, int internId) {
        super(name, internId); 
        this.internId = internId;
    }

    @Override
    public String toString() {
        return "Intern [name=" + name + ", internId=" + internId + "]";
    }
}


// class Intern extends JuniorDeveloper {
//     String name;
//     int internId;

//     public Intern(String name, int empId) {
//         this.name = name;
//         this.internId = internId;
//     }

//     @Override
//     public String toString() {
//         return "Intern [name=" + name + ", internId=" + internId + "]";
//     }
// }

