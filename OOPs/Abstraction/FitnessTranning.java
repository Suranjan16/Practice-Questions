public class FitnessTranning {
    public static void main(String[] args) {
        FitnessTrainer ft;
        ft = new YogaTeacher();
        new FitnessTranning().accessTrainer(ft);
        ft = new WeightTeacher();
        new FitnessTranning().accessTrainer(ft);
    }
    void accessTrainer(FitnessTrainer ft) {
        ft.conductSessions();
        ft.giveAdvice();
    }
}

abstract class FitnessTrainer {
    abstract void conductSessions();
    abstract void giveAdvice();
}

class YogaTeacher extends FitnessTrainer {
    @Override
    void conductSessions () {
        System.out.println("Conduct sessions for yoga.");
    }
    @Override
    void giveAdvice() {
        System.out.println("Give advice about yoga.");
    }
}
class WeightTeacher extends FitnessTrainer {
    @Override
    void conductSessions () {
        System.out.println("Conduct sessions for weight lifting.");
    }
    @Override
    void giveAdvice() {
        System.out.println("Give advice about weight lifting.");
    }
}


