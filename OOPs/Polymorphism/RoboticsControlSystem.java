

public class RoboticsControlSystem {
    public static void main(String[] args) {
        Robot robo;
        robo = new FighterRobo();
        operateRobo(robo);
        
        if (robo instanceof FighterRobo fighterRobo) {
            fighterRobo.fight();
        }
    }
    static void operateRobo(Robot r) {
        r.charge();
        r.learn();
        r.tasks();
    }
}

class Robot {
    void learn() {
        System.out.println("Robot can learn anything.");
    }
    void charge() {
        System.out.println("Robot can charge.");
    }
    void tasks() {
        System.out.println("Robot do tasks.");
    }
}

class FighterRobo extends Robot {
    void fight() {
        System.out.println("Robo is doing fight.");
    }
}