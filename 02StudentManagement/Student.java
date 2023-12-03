public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Get name.
     */
    public String getName() {
        return name;
    }

    /**
     * Get ID.
     */
    public String getId() {
        return id;
    }

    /**
     * Get group.
     */
    public String getGroup() {
        return group;
    }

    /**
     * Get email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set ID.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Set group.
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Set email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Default constructor.
     */
    Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor with name, id and email.
     */
    Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    /**
     * Copy constructor.
     */
    Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }
    
    /**
     * Constructor with name, id, group and email.
     */
    Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    /**
     * Get student's info.
     */
    String getInfo() {
        return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    }
}
