public class MethodOverloading {
    public static void main(String[] args) {
        Activity ac = new Activity();
        ac.activityType("Play");
        ac.activityType("Play", 2);
        ac.activityType("Play", 3, 10);
    }
}

class Activity {
    public void activityType(String activity) {
        System.out.println("Activity type: " + activity);
    }
    public void activityType(String activity, int time) {
        System.out.println("Activity type: " + activity + ", Durantion: " + time);
    }
    public void activityType(String activity, int time, int participants) {
        System.out.println("Activity type: " + activity + ", Durantion: " + time + ", Participants: " + participants);
    }
}
