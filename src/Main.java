public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan Ivanov", "ST001", "Computer Science");
        Student s2 = new Student("Maria Petrova", "ST002", "Software Engineering");
        Student s3 = new Student("Alibi Kuanysh", "ST003", "Data Science");
        Student s4 = new Student("Elena Sid", "ST004", "Computer Science");
        Student s5 = new Student("Dmitry Kim", "ST005", "Information Systems");

        s1.addCredits(30);
        s1.updateGPA(3.8);
        s2.addCredits(45);
        s2.updateGPA(3.4);
        s3.addCredits(20);
        s3.updateGPA(3.9);
        s4.addCredits(50);
        s4.updateGPA(3.2);
        s5.addCredits(15);
        s5.updateGPA(4.0);

        Course myCourse = new Course("OOP Java", "Dr. Smith", 5);
        myCourse.addStudent(s1, 0);
        myCourse.addStudent(s2, 1);
        myCourse.addStudent(s3, 2);
        myCourse.addStudent(s4, 3);
        myCourse.addStudent(s5, 4);

        System.out.println(myCourse);
        System.out.println("Average GPA: " + myCourse.courseAverageGPA());

        Student[] studentArray = {s1, s2, s3, s4, s5};

        System.out.println("\n--- Statistics ---");
        Student top = getTopStudent(studentArray);
        System.out.println("Top Student: " + (top != null ? top.getName() : "None"));
        System.out.println("Honors Count: " + countHonors(studentArray));
        System.out.println("Total Credits: " + totalCredits(studentArray));
    }

    public static Student getTopStudent(Student[] students) {
        if (students == null || students.length == 0) return null;
        Student top = students[0];
        for (Student s : students) {
            if (s != null && s.getGpa() > top.getGpa()) {
                top = s;
            }
        }
        return top;
    }

    public static int countHonors(Student[] students) {
        int count = 0;
        for (Student s : students) {
            if (s != null && s.isHonors()) {
                count++;
            }
        }
        return count;
    }

    public static int totalCredits(Student[] students) {
        int total = 0;
        for (Student s : students) {
            if (s != null) {
                total += s.getCredits();
            }
        }
        return total;
    }
}