import java.util.Scanner;

class Student {
    // Data members
    private String studentName;
    private String rollNumber;
    private double marks;
    private String courseName;
    private int courseCredits;

    // Parameterized Constructor
    public Student(String studentName, String rollNumber, double marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    // Method to calculate course fee (Rs. 1500 per credit)
    public double calculateFee() {
        return courseCredits * 1500.0;
    }

    // Method to check eligibility (marks >= 50)
    public boolean checkEligibility() {
        return marks >= 50.0;
    }

    // Method to calculate scholarship amount
    public double calculateScholarship() {
        double fee = calculateFee();
        if (marks >= 85.0) {
            return 0.20 * fee; // 20% scholarship
        } else if (marks >= 70.0 && marks <= 84.0) {
            return 0.10 * fee; // 10% scholarship
        } else {
            return 0.0;       // No scholarship
        }
    }

    // Method to calculate final fee after scholarship deduction
    public double calculateFinalFee() {
        return calculateFee() - calculateScholarship();
    }

    // Method to display all student and course details
    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Marks        : " + marks);
        System.out.println("Course Name  : " + courseName);
        System.out.println("Credits      : " + courseCredits);
        System.out.println("Eligibility  : Eligible");
        System.out.println("Total Fee    : Rs. " + calculateFee());
        System.out.println("Scholarship  : Rs. " + calculateScholarship());
        System.out.println("Final Fee    : Rs. " + calculateFinalFee());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input details
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();

        System.out.print("Enter Course Credits: ");
        int courseCredits = scanner.nextInt();

        // Creating object using parameterized constructor
        Student student = new Student(studentName, rollNumber, marks, courseName, courseCredits);

        // Checking eligibility first
        if (student.checkEligibility()) {
            student.displayDetails();
        } else {
            System.out.println("\nStudent is not eligible for registration due to low marks (Below 50).");
        }

        scanner.close();
    }
}