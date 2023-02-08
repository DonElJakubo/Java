package rekru.rozmowy.NokiaJavaFullstackWorkingStudent.Java.DefinicjePlusPrzyklady.WprowadzenieDodatowychSkladowych.Przyklad;

import rekru.rozmowy.NokiaJavaFullstackWorkingStudent.Java.DefinicjePlusPrzyklady.WprowadzenieDodatowychSkladowych.Przyklad.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang", 2019, 30000.00);
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
    }
}
