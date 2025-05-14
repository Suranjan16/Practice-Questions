public class AnimalFoodChain {
    public static void main(String[] args) {
        Harbivore h;
        h = new Cow();
        accessAnimal(h);
        h = new Deer();
        accessAnimal(h);
    }
    static void accessAnimal(Harbivore hv) {
        hv.eat();
        hv.sleep();
    }
}

abstract class Animal {
    abstract void sleep();
    @SuppressWarnings("unused")
    abstract void eat();
}

abstract class Harbivore extends Animal {
    @Override
    void eat() {
        System.out.println("Harbivore animals eats grasses and plants.");
    }  
}

class Cow extends Harbivore {
    @Override
    void sleep() {
        System.out.println("Cow sleeps for 12 hours.");
    }
}

class Deer extends Harbivore {
    @Override
    void sleep() {
        System.out.println("Deer sleeps for 15 hours.");
    }
}
