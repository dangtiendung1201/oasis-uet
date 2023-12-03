public class Person {
    private String name;
    private String address;

    /**
     * Constructor with name and address.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
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

    /**
     * Print information.
     */
    public String toString() {
        return ("Person[name=" + name + ",address=" + address + "]");
    }
}
