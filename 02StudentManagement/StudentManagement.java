public class StudentManagement {

    // TODO: khai bao thuoc tinh students la array chua cac doi tuong thuoc lop
    // Student (max. 100)
    static final int MaxStudents = 100;
    private Student[] students = new Student[MaxStudents];
    private int numStudents = 0;
    private String[] groups = new String[MaxStudents];
    private int numGroups = 0;

    /**
     * Check if two students are in the same group.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Add a student to the list.
     */
    public void addStudent(Student newStudent) {
        students[numStudents] = newStudent;
        numStudents++;

        boolean newGroup = true;
        for (int i = 0; i < numGroups; i++) {
            if (groups[i].equals(newStudent.getGroup())) {
                newGroup = false;
                break;
            }
        }

        if (newGroup) {
            groups[numGroups] = newStudent.getGroup();
            numGroups++;
        }
    }

    /**
     * Get the list of students.
     */
    public String studentsByGroup() {
        String result = "";

        for (int i = 0; i < numGroups; i++) {
            result += groups[i] + "\n";
            for (int j = 0; j < numStudents; j++) {
                if (students[j].getGroup().equals(groups[i])) {
                    result += students[j].getInfo() + "\n";
                }
            }
        }

        return result;
    }

    /**
     * Remove a student by id.
     */
    public void removeStudent(String id) {
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < numStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                numStudents--;
                break;
            }
        }
    }

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        sm.addStudent(new Student("Nguyen Van An", "17020001", "K62CC", "17020001@vnu.edu.vn"));
        sm.addStudent(new Student("Nguyen Van B", "17020002", "K62CC", "17020002@vnu.edu.vn"));
        sm.addStudent(new Student("Nguyen Van C", "17020003", "K62CB", "17020003@vnu.edu.vn"));
        sm.addStudent(new Student("Nguyen Van D", "17020004", "K62CB", "17020004@vnu.edu.vn"));
    }
}
