public class MethodsDuringInheritance {
    public static void main(String[] args) {
        Developer c = new Developer();
        c.inheritedMethod(); // inherited method from parent class
        c.overriddenMethod(); // overridden method from child class      
        c.childSpecificMethod(); // child specific method
    }
}

class Engineer {
    void inheritedMethod() {
        System.out.println("This a inherited method from parent.");
    }
    
    @SuppressWarnings("unused")
    void overriddenMethod() {
        System.out.println("This is a method from parent class.");
    }
}

class Developer extends Engineer {
    
    @Override
    public void overriddenMethod() {
        System.out.println("This is a method from Developer class.");
    }

    void childSpecificMethod() {
        System.out.println("This is a child specific method.");
    }
}