public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Default constructor.
     */
    public Car() {

    }

    /**
     * Constructor with model, registrationNumber, owner and numberOfDoors.
     */
    public Car(String brand, String model,
            String registrationNumber, Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Get info.
     */
    public String getInfo() {
        String info = "";

        info += "Car:" + "\n";
        info += "\t" + "Brand: " + brand + "\n";
        info += "\t" + "Model: " + model + "\n";
        info += "\t" + "Registration Number: " + registrationNumber + "\n";
        info += "\t" + "Number of Doors: " + numberOfDoors + "\n";
        info += "\t" + "Belongs to " + owner.getName() + " - " + owner.getAddress() + "\n";

        return info;
    }

    /**
     * Get number of doors.
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Set number of doors.
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}