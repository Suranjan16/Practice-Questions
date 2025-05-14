// package OOPs.StaticVar And Methods;

public class FindTheAreaOfCircle {
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.radius = 10;
        cir.calculateArea();
    }
}

class Circle {
    double radius;
    static double pi = 3.14;
    public void calculateArea() {
        double area = pi * radius * radius;
        System.out.println("Area = "  + area);
    }
}