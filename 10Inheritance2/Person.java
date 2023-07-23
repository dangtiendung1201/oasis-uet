public class Person {
    private String name;
    private String address;

    /**
     * Constructor.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Getter.
     */
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    /**
     * Setter.
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Print.
     */
    public String toString() {
        return ("Person[name=" + name + ",address=" + address + "]");
    }
}
