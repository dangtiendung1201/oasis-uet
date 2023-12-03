public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * Default constructor.
     */
    public Vehicle() {
    }

    /**
     * Constructor with brand, model and registration number.
     */
    public Vehicle(String brand, String model,
            String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * Get info.
     */
    public abstract String getInfo();

    /**
     * Tranfer ownership.
     */
    public void transferOwnership(Person newOwner) {
        owner = newOwner;
    }

    /**
     * Get brand.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Set brand.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Get model.
     */
    public String getModel() {
        return model;
    }

    /**
     * Set model.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Get registration number.
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Set registration number.
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * Get owner.
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * Set owner.
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }
}