import java.io.FileInputStream;
// import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Deserialization {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("Sample.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student st = (Student) ois.readObject();
        System.out.println(st);
    }
}
class Student implements Serializable {
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
}