package devDojo.modificadorFinal.test;

import devDojo.modificadorFinal.domain.Cars;

public class CarTest {
    public static void main(String[] args) {
        Cars car = new Cars();
        System.out.println(Cars.SPEED_LIMIT);
        car.DRIVER.setName("João");
        System.out.println(car.DRIVER);
    }
}
