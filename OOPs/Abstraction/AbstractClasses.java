public class AbstractClasses {
    public static void main(String[] args) {
        Mentor m;
        m = new JavaMentor();
        accessMentor(m);
        m = new SqlMentor();
        accessMentor(m);

    }
    static void accessMentor(Mentor m) {
        m.teach();
        m.takeAttendance();
        m.checkAttendance();
    }
}

abstract class Mentor {
    abstract public void teach();
    abstract public void takeAttendance();
    public void checkAttendance() {
        System.out.println("You were in the class.");
    }
}

class JavaMentor extends Mentor {
    @Override
    public void teach () {
        System.out.println("Teach java.");
    }
    @Override
    public void takeAttendance() {
        System.out.println("Take attendance of the java class.");
    }
}
class SqlMentor extends Mentor {
    @Override
    public void teach () {
        System.out.println("Teach Sql.");
    }
    @Override
    public void takeAttendance() {
        System.out.println("Take attendance of the Sql class.");
    }
}
