import domain.Cars;

public class CarTest {

  public static void main(String[] args) {
    Cars car = new Cars();
    car.DRIVER.setName("João");
    
    System.out.println(Cars.SPEED_LIMIT);
    System.out.println(car.DRIVER);
  }
}
