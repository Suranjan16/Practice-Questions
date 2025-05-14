

public class Inheritance1 {
    public static void main(String[] args) {
        System.out.println("CricketPlayer plays cricket");
        CricketPlayer cp = new CricketPlayer();
        cp.exercise();
        cp.playMatch();

        System.out.println("FootballPlayer plays cricket");
        FootballPlayer fp = new FootballPlayer();
        fp.exercise();
        fp.playMatch();
        
        System.out.println("HockeyPlayer plays cricket");
        HockeyPlayer hp = new HockeyPlayer();
        hp.exercise();
        hp.playMatch();
    }
}

class Player {
    public void exercise() {
        System.out.println("Players do exercise before match");
    }
    public void playMatch() {
        System.out.println("Players play match for earning");
    }
}

class CricketPlayer extends Player {
    
}
class FootballPlayer extends Player {

}
class HockeyPlayer extends Player {

}