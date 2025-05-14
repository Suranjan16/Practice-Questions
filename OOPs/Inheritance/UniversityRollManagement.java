public class UniversityRollManagement {
    public static void main(String[] args) {
        person p = new person();
        p.name = "Suranjan Maity";
        p.introduce();

        student s = new student();
        s.name = "Sayan Maity";
        s.rollNumber = "12345";
        s.attendClass();
        s.introduce();

        teacher t = new teacher();
        t.name = "Sumit Maity";
        t.subject = "Civil Engineering";
        t.conductLecture();
        t.introduce();

    }
}

class person {
    String name;

    void introduce() {
        System.out.println("My name is " + name  + ".");
    }
}

class student extends person {
    String rollNumber; 

    void attendClass() {
        System.out.println(name + " is attending class with roll number " + rollNumber + ".");
    }
}

class teacher extends person {
    String subject;

    void conductLecture() {
        System.out.println(name + " is conducting a lecture on " + subject + ".");
    }
}