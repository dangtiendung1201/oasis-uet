public class Student {

    // TODO: khai bao cac thuoc tinh cho Student
    private String name;
    private String id;
    private String group;
    private String email;

    // TODO: khai bao cac phuong thuc getter, setter cho Student
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        if (id == null) {
            return;
        }
        this.id = id;
    }

    public void setGroup(String group) {
        if (group == null) {
            return;
        }
        this.group = group;
    }

    public void setEmail(String email) {
        if (email == null) {
            return;
        }
        this.email = email;
    }

    /**
     * Constructor 1
     */
    Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * 
     * @param n
     * @param sid
     * @param em
     */
    Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    /**
     * Constructor 3
     * 
     * @param s
     */
    Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }
    
    /**
     * Constructor 4
     */
    Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    String getInfo() {
        return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    }
}
