

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy(); 
        p.id = 1;
        p.weeps();
    }
}

class Animal {
    int id;
     void eats() {
        System.out.println("This animal eats food.");
        System.out.println("pet Id : " + id);
     }
}

class Dog extends Animal {
     void bark() {
        eats();
        System.out.println("Dog barks.");
     }
}

class Puppy extends Dog { 
    void weeps() {
        bark();
        System.out.println("Puppy weeps.");
    }
}
