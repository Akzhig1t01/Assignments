public class Course {
    private String courseName;
    private String instructor;
    private Student[] students;

    public Course(String courseName, String instructor, int arraySize) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new Student[arraySize];
    }

    public void addStudent(Student s, int index) {
        if (index >= 0 && index < students.length) {
            students[index] = s;
        } else {
            System.out.println("Ошибка: Индекс вне границ массива!");
        }
    }

    public double courseAverageGPA() {
        double sum = 0;
        int count = 0;
        for (Student s : students) {
            if (s != null) {
                sum += s.getGpa();
                count++;
            }
        }
        return (count == 0) ? 0.0 : sum / count;
    }

    public Student highestCreditStudent() {
        if (students.length == 0) return null;

        Student topStudent = null;
        int maxCredits = -1;

        for (Student s : students) {
            if (s != null && s.getCredits() > maxCredits) {
                maxCredits = s.getCredits();
                topStudent = s;
            }
        }
        return topStudent;
    }

    @Override
    public String toString() {
        return "Курс: " + courseName + " | Инструктор: " + instructor;
    }
}