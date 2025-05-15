package ch3;

//Create a GradeBook class that displays a course name and instructor

public class GradeBook {
    public static void main(String[] args) {
        GradeBook myGradeBook = new GradeBook(" Java", "M. A. Nur Quraishi");
        myGradeBook.displayMessage();
    }
    private String courseName;
    private String instructorName;

    public GradeBook(String courseName, String instructorName) {
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
        System.out.println("Welcome to the grade book for " + courseName + "!");
        System.out.println("This course is presented by: " + instructorName);
    }


}

