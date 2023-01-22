package model;

public class Registration {

    private Offering theOffering;
    private Student theStudent;
    private char theGrade;

    public void register(Student theStudent, Offering theOffering) {
        this.theStudent = theStudent;
        this.theOffering = theOffering;
        theOffering.addStudent(this);
        theStudent.addCourse(this);
    }

    public void unregister(Student theStudent, Offering theOffering) {
        this.theStudent = theStudent;
        this.theOffering = theOffering;
        theOffering.removeStudent(this);
        theStudent.removeCourse(this);
    }

    public void setTheGrade(char theGrade) {
        this.theGrade = theGrade;
    }

    public char getTheGrade() {
        return theGrade;
    }

    public Offering getOffering() {
        return this.theOffering;
    }

    public String getCourseName() {
        return this.theOffering.getCourseName();
    }

    public int getCourseID() {
        return this.theOffering.getCourseID();
    }

    public int getStudentsInOffering() {
        return this.theOffering.getStudentsInOffering();
    }

    @Override
    public String toString() {
        return "" + theOffering.print() + ", " + theOffering;

    }
}
