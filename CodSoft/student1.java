public class student1 {
  private String name;
  private int rollNumber;
  private char grade;

  public student1(String name, int rollNumber, char grade) {
      this.name = name;
      this.rollNumber = rollNumber;
      this.grade = grade;
  }

  public String getName() {
      return name;
  }

  public int getRollNumber() {
      return rollNumber;
  }

  public char getGrade() {
      return grade;
  }

  public void setName(String name) {
      this.name = name;
  }

  public void setRollNumber(int rollNumber) {
      this.rollNumber = rollNumber;
  }

  public void setGrade(char grade) {
      this.grade = grade;
  }

  public void displayDetails() {
      System.out.println("Name: " + name);
      System.out.println("Roll Number: " + rollNumber);
      System.out.println("Grade: " + grade);
  }

  public static void main(String[] args) {
      student1 student1 = new student1("John Doe", 101, 'A');
      student1.displayDetails();
      student1.setGrade('B');
      student1.displayDetails();
  }
}
