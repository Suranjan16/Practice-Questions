// package Advance Java.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {
    public static void main(String[] args) throws IOException {
        Student st = new Student(1, "Suranjan", 9.5);

        FileOutputStream fos = new FileOutputStream("Sample.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(st);
        oos.close();
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
