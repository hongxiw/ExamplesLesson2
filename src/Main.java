public class Main {

    public static void main(String[] args) {
        Car car = new Car("Prius", 2020, 5);
        car.refuel(100);
        car.drive(1);
        car.drive(7);
        car.drive(2);
        car.drive(24);
        car.drive(8);
    }

}