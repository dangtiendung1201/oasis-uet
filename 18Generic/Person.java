public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String address;

    /**
     * Default constructor.
     */
    public Person() {
        this.name = "";
        this.age = 0;
        this.address = "";
    }

    /**
     * Constructor with name, age and address.
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * Get name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Set age.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Compare.
     */
    public int compareTo(Person person) {
        if (this.name.compareTo(person.name) == 0) {
            return this.age - person.age;
        } else {
            return this.name.compareTo(person.name);
        }
    }

}