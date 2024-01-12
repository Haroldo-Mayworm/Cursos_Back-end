public class Car {
    private String name;
    private double maxSpeed;
    private static double limitSpeed = 250;

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.println("____________________");
        System.out.println("Name: " + this.name);
        System.out.println("Maximum speed: " + this.maxSpeed);
        System.out.println("Limit speed: " + Car.limitSpeed);
    }

    // Getter e Setter - Static
    public static double getLimitSpeed() {
        return Car.limitSpeed;
    }

    public static void setLimitSpeed(double limitSpeed) {
        Car.limitSpeed = limitSpeed;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}