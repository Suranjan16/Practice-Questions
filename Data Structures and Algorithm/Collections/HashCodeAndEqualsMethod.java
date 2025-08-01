import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        Student s1 = new Student(1,"rahul");
        Student s2 = new Student(1,"rahul");
        Student s3 = new Student(2,"rahul");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s2));
    }
}


class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.hashCode() == this.hashCode()) {
            return true;
        } else {
            return false;
        }
    }
}
