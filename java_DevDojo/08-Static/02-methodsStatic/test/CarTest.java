import domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("Audi", 290);
        Car c2 = new Car("Volvo", 255);
        Car c3 = new Car("Audi", 290);

        Car.setLimitSpeed(180);

        c1.print();
        c2.print();
        c3.print();
    }
}
