public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Nguyen Van A", "Ha Noi");
        // Brand: Mercedes-Benz
        // Model: S400
        // Registration Number: 30A - 888.88
        // Number of Doors: 4
        Vehicle cars = new Car("Mercedes-Benz", "S400", "30A - 888.88", person1, 4);
        // Brand: Yamaha
        // Model: YZF-R6
        // Registration Number: 29 - P1 686.68
        // Has Side Car: false
        Vehicle motorBikes = new MotorBike("Yamaha", "YZF-R6", "29 - P1 686.68", person1, false);
        person1.addVehicle(cars);
        person1.addVehicle(motorBikes);
        person1.removeVehicle(cars.getRegistrationNumber());
        System.out.println(person1.getVehiclesInfo());
    }
}