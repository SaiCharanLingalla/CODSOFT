import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentManagementSystem {
    private ArrayList<student1> studentList;

    public StudentManagementSystem() {
        studentList = new ArrayList<>();
    }

    public void addStudent(student1 student) {
        studentList.add(student);
        System.out.println("Student added successfully.");
    }

    public void removeStudent(int rollNumber) {
        Iterator<student1> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            student1 student = iterator.next();
            if (student.getRollNumber() == rollNumber) {
                iterator.remove();
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    public student1 searchStudent(int rollNumber) {
        for (student1 student : studentList) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the system.");
        } else {
            System.out.println("List of Students:");
            for (student1 student : studentList) {
                student.displayDetails();
                System.out.println("--------------------");
            }
        }
    }

    public static void main(String[] args) {
        StudentManagementSystem studentSystem = new StudentManagementSystem();

        studentSystem.addStudent(new student1("John Doe", 101, 'A'));
        studentSystem.addStudent(new student1("Jane Smith", 102, 'B'));
        studentSystem.displayAllStudents();

        int searchRollNumber = 101;
        student1 searchedStudent = studentSystem.searchStudent(searchRollNumber);
        if (searchedStudent != null) {
            System.out.println("Student found:");
            searchedStudent.displayDetails();
        } else {
            System.out.println("Student with Roll Number " + searchRollNumber + " not found.");
        }

        int removeRollNumber = 102;
        studentSystem.removeStudent(removeRollNumber);

        studentSystem.displayAllStudents();
    }

    public void setStudentList(ArrayList<student1> loadedStudents) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'setStudentList'");
    }

    public List<student1> getStudentList() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'getStudentList'");
    }
}
