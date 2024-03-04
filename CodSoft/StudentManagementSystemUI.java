import java.util.Scanner;

public class StudentManagementSystemUI {
    private static StudentManagementSystem studentSystem = new StudentManagementSystem();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("Student Management System Menu:");
            System.out.println("1. Add a Student");
            System.out.println("2. Remove a Student");
            System.out.println("3. Search for a Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    displayAllStudents();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting Student Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter grade: ");
        char grade = scanner.next().charAt(0);

        student1 newStudent = new student1(name, rollNumber, grade);
        studentSystem.addStudent(newStudent);

        System.out.println("Student added successfully.");
    }

    private static void removeStudent() {
        System.out.print("Enter roll number of the student to remove: ");
        int rollNumber = scanner.nextInt();

        studentSystem.removeStudent(rollNumber);
    }

    private static void searchStudent() {
        System.out.print("Enter roll number of the student to search: ");
        int rollNumber = scanner.nextInt();

        student1 searchedStudent = studentSystem.searchStudent(rollNumber);
        if (searchedStudent != null) {
            System.out.println("Student found:");
            searchedStudent.displayDetails();
        } else {
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
        }
    }

    private static void displayAllStudents() {
        studentSystem.displayAllStudents();
    }
}
