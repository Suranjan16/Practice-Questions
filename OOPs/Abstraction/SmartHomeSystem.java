public class SmartHomeSystem {
    public static void main(String[] args) {
        SmartDevice s;
        s = new SmartLight();
        accessDevice(s);
        s = new SmartSecurity();
        accessDevice(s);
    }
    static void accessDevice(SmartDevice a) {
        a.turnon();
        a.turnoff();
    }
}

interface SmartDevice {
    void turnon();
    void turnoff();
}

class SmartLight implements SmartDevice {
    @Override
    public void turnon() {
        System.out.println("SmartLight turned on.");
    }
    @Override
    public void turnoff() {
        System.out.println("SmartLight turned off.");
    }
}
class SmartSecurity implements SmartDevice {
    @Override
    public void turnon() {
        System.out.println("SmartSecurity is armed.");
    }
    @Override
    public void turnoff() {
        System.out.println("SmartSecurity is disArmed.");
    }
}