public class NotificationSystem {
    public static void main(String[] args) {
        Notification n1 = new Notification();
        n1.display();
        Notification n2 = new Notification("Hello");
        n2.display();
        Notification n3 = new Notification("Hello", 3);
        n3.display();
        
    }
}

class Notification {
    String message;
    int repeatCount;
    @SuppressWarnings("unused")
    boolean hasCustomMessage;
    
    public Notification() {
        message = "No new message";
        repeatCount = 0;
        hasCustomMessage = false;
    }

    public Notification(String message) {
        this.message = message;
        repeatCount = 0;
        hasCustomMessage = true;
    }

    public Notification(String message, int repeatCount) {
        this.message = message;
        this.repeatCount = repeatCount;
        hasCustomMessage = true;
    }

    public Notification(boolean hasCustomMessage) {
        this.hasCustomMessage = hasCustomMessage;
    }

    public Notification(boolean hasCustomMessage, String message, int repeatCount) {
        this.hasCustomMessage = hasCustomMessage;
        this.message = message;
        this.repeatCount = repeatCount;
    }
    void display() {
        System.out.println("Notification : " + message);
        if (repeatCount > 0) 
        System.out.println("Repeat Count: " + repeatCount);
    }
}
