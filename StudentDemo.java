class Student {
    String name;
    int rollNo;
    int marks;

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 50)
            return "D";
        else
            return "F";
    }

    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Marks        : " + marks);
        System.out.println("Grade        : " + calculateGrade());
        System.out.println("---------------------------");
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Arun", 101, 92);
        Student s2 = new Student("Priya", 102, 76);

        s1.display();
        s2.display();
    }
}