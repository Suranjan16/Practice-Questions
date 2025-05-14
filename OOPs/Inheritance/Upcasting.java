public class Upcasting {
    public static void main(String[] args) {
       Animal a = new Animal();
         a.sound();

        Animal d = new Dog();
        d.sound();
    }
    
}

class Animal {
    void sound() {
        System.out.println("Animal makes sound.");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}