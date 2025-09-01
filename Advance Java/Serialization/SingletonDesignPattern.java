public class SingletonDesignPattern {
    public static void main(String[] args) {
        Student s = Student.getStudent();
        int a = s.hashCode();
        System.out.println(a);
    }
}

class Student {
    static Student st;
    private Student() {

    }
    public static Student getStudent() {
        if(st == null) {
           st = new Student();
        }
        return st;
    }
}