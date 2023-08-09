public class Person implements Comparable<Person> {
    // POJO class
    private String name;
    private int age;
    private String adress;

    public Person() {
        this.name = "";
        this.age = 0;
        this.adress = "";
    }

    public Person(String name, int age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAdress() {
        return adress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int compareTo(Person person) {
        if (this.name.compareTo(person.name) == 0) {
            return this.age - person.age;
        } else {
            return this.name.compareTo(person.name);
        }
    }

}