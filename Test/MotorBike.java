public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * Default constructor.
     */
    public MotorBike() {

    }

    /**
     * Constructor with model, registrationNumber, owner and hasSidecar.
     */
    public MotorBike(String brand, String model,
            String registrationNumber, Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * Get info.
     */
    public String getInfo() {
        String info = "";

        info += "Motor Bike:" + "\n";
        info += "\t" + "Brand: " + brand + "\n";
        info += "\t" + "Model: " + model + "\n";
        info += "\t" + "Registration Number: " + registrationNumber + "\n";
        info += "\t" + "Has Side Car: " + hasSidecar + "\n";
        info += "\t" + "Belongs to " + owner.getName() + " - " + owner.getAddress() + "\n";

        return info;
    }

    /**
     * Get has sidecar.
     */
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    /**
     * Set has sidecar.
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}