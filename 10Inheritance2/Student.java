public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Constructor with name, address, program, year and fee.
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * Get program.
     */
    public String getProgram() {
        return program;
    }

    /**
     * Set program.
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * Get year.
     */
    public int getYear() {
        return year;
    }

    /**
     * Set year.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Get fee.
     */
    public double getFee() {
        return fee;
    }

    /**
     * Set fee.
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * Print information.
     */
    public String toString() {
        return ("Student[" + super.toString() + ",program="
                + program + ",year=" + year + ",fee=" + fee + "]");
    }
}