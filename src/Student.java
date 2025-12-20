public class Student {
    private String name;
    private String id;
    private String major;
    private Double gpa;
    private int credits;


    public Student(String name, String id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = 0.0;
        this.credits = 0;
    }

    public void addCredits(int c) {
        if (c > 0) {
            this.credits += c;
        }
    }

    public void updateGPA(double newGPA) {
        if (newGPA >= 0.0 && newGPA <= 4.0) {
            this.gpa = newGPA;
        }
    }

    public boolean isHonors() {
        return this.gpa >= 3.5;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getMajor() {
        return major;
    }

    public Double getGpa() {
        return gpa;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "Student: " + name + " (ID: " + id + ")" + "\n Major: " + major + "\n Current GPA: " + gpa + "\n Total Credits: " + credits;
    }

}
