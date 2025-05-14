
public class StaticMethodImplementation {
    public static void main(String[] args) {
        School.dayOff();
        
        School sc = new School();
        sc.roomNo = 101;
        sc.classOff();

        School sc1 = new School();
        sc1.roomNo = 103;
        sc1.classOff();
    }
}

class School {
    int roomNo;
    public static void dayOff() {
        System.out.println("For new year celebration the class will be off for tomorrow");
    }

    public void classOff() {
        System.out.println("For some unavoideble circumtances the 2nd period for room no " + roomNo +  " will be suspended for tomorrow.");
    }
}
