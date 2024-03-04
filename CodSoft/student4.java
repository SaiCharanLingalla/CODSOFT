import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class student4 {

    // Method to write student data to a text file
    public static void writeStudentDataToFile(List<student1> list, String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (student1 student : list) {
                writer.println(student.getName() + "," + student.getRollNumber() + "," + student.getGrade());
            }
            System.out.println("Student data has been written to the file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing student data to the file: " + e.getMessage());
        }
    }

    // Method to read student data from a text file
    public static ArrayList<student1> readStudentDataFromFile(String filePath) {
        ArrayList<student1> studentList = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0];
                    int rollNumber = Integer.parseInt(parts[1]);
                    char grade = parts[2].charAt(0);

                    student1 student = new student1(name, rollNumber, grade);
                    studentList.add(student);
                }
            }
            System.out.println("Student data has been read from the file successfully.");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }

        return studentList;
    }

    public static void main(String[] args) {
        // Creating an instance of StudentManagementSystem
        StudentManagementSystem studentSystem = new StudentManagementSystem();

        // Adding some students to the system
        studentSystem.addStudent(new student1("John Doe", 101, 'A'));
        studentSystem.addStudent(new student1("Jane Smith", 102, 'B'));

        // Writing student data to a file
        String filePath = "\"C:\\CodSoft\\student_data.txt\"";
        writeStudentDataToFile(studentSystem.getStudentList(), filePath);

        // Clearing the student system (optional for this example)
        studentSystem = new StudentManagementSystem();

        // Reading student data from the file
        ArrayList<student1> loadedStudents = readStudentDataFromFile("\"C:\\CodSoft\\student_data.txt.txt\"");

        // Adding the loaded students back to the system
        studentSystem.setStudentList(loadedStudents);

        // Displaying all students from the system after loading
        studentSystem.displayAllStudents();
    }
}
