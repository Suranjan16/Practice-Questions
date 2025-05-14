


public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cricketer ck = new Cricketer();
        ck.name = "Virat Kohli";
        System.out.println("Player Name: " + ck.name);
        ck.exercise();
        ck.playMatch();
        Footballer fb = new Footballer();
        fb.name = "Leonel Messi";
        System.out.println("Player Name: " + fb.name);
        fb.exercise();
        fb.playMatch();
        TennisPlayer tp = new TennisPlayer();
        tp.name = "Roger Federar";
        System.out.println("Player Name: " + tp.name);
        tp.exercise();
        tp.playMatch();
    }
}

class Player {
    String name;
    void exercise() {
        System.out.println("Player exercise before the match.");
    }
    void playMatch() {
        System.out.println("Player play matches to earn money.");
    }
}

class Cricketer extends Player {

}

class Footballer extends Player {
    
}

class TennisPlayer extends Player {

}