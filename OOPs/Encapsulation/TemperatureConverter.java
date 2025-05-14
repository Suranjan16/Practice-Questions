public class TemperatureConverter {
    public static void main(String[] args) {
        Temperature temp1 = new Temperature(25.0);

        System.out.println("Initial temperature:");
        System.out.println("Celcius: " + temp1.getTemperature()+ " C.");
        System.out.println("Fahrenheit: " + temp1.getFarhenheit()+ " F.");

        temp1.setCelcius(30.0);
        System.out.println("Final temperature:");
        System.out.println("Celcius: " + temp1.getTemperature()+ " C.");
        System.out.println("Fahrenheit: " + temp1.getFarhenheit()+ " F.");
    }
}

class Temperature {
    private double celcius;

    public Temperature(double celcius) {
        this.celcius = celcius;
    }

    public double getTemperature() {
        return celcius;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    public double getFarhenheit() {
        return (celcius * 9/2) + 32;
    }
}
