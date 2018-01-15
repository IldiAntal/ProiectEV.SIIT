import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<Car>();

        Car c1 = new Car("Volkswagen-eUP", 15, 2000, 25000, true, 400, 20);
        Car c2 = new Car("Renault-Zoe", 10, 2005, 33000, true, 450, 30);
        Car c3 = new Car("BMW-i3", 5, 2010, 40000, true, 700, 70);
        Car c4 = new Car("Smart-FourTwo", 5, 2009, 22000, false, 500, 30);

        {
            cars.add(c1);
            cars.add(c2);
            cars.add(c3);
            cars.add(c4);
        }

        for (Car car : cars) {
            System.out.println(car.getCarModel() + " " + car.getCarStock() + " " + car.getPrice());
        }




    }
}
