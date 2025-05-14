public class StudentInformationManagement {
    public static void main(String[] args) {
        Student student1 = new Student(20, "Suranjan", 01);

        System.out.println("Initial student details: ");
        System.out.println("Roll Number: " + student1.getRollNumber());
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());

        student1.setName("Sayan");
        student1.setAge(-6);
        
        System.out.println("Final student details: ");
        System.out.println("Roll Number: " + student1.getRollNumber());
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
    }
}

final class Student {
    private final int rollNumber;
    private String name;
    private int age;

    public Student(int age, String name, int rollNumber) {
        setAge(age);
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) 
         this.age = age;
        else 
         System.out.println("Invalid age! Age must be positive.");
    }
}
