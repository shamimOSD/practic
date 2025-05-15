package ch3;

//Modify GradeBook to input a course name at runtime

import java.util.Scanner;

public class GradeBook1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the course name: ");
        String course = input.nextLine();
        System.out.print("Enter the instructor name: ");
        String instructor = input.nextLine();
        GradeBook myGradeBook = new GradeBook(course, instructor);
        myGradeBook.displayMessage();
        input.close();
    }
    private String courseName;
    private String instructorName;
    public GradeBook1(String courseName, String instructorName) {
        this.courseName = courseName;
        this.instructorName = instructorName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
    public String getInstructorName() {
        return instructorName;
    }
    public void displayMessage() {
        System.out.println("\nWelcome to the grade book for " + courseName + "!");
        System.out.println("This course is presented by: " + instructorName);
    }

}
