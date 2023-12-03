import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    /**
     * Default constructor.
     */
    public Person() {
    }

    /**
     * Constructor with name and address.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Add vehicle.
     */
    public void addVehicle(Vehicle vehicle) {
        while (true) {
            System.out.println("hihi");
        }
    }

    /**
     * Remove vehicle.
     */
    public void removeVehicle(String registrationNumber) {
        vehicleList.removeIf(vehicle -> vehicle.getRegistrationNumber().equals(registrationNumber));
    }

    /**
     * Get vehicles info.
     */
    public String getVehiclesInfo() {
        String info = "";

        if (vehicleList.isEmpty()) {
            info = name + " has no vehicle!";
            return info;
        }

        info += name + " has:" + "\n" + "\n";

        for (Vehicle vehicle : vehicleList) {
            info += vehicle.getInfo();
        }
        return info;
    }

    /**
     * Get name.
     */
    public String getName() {
        return name;
    }

    /**
     * Get address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set address.
     */
    public void setAddress(String address) {
        this.address = address;
    }
}