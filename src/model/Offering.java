package model;

import java.util.ArrayList;

public class Offering {

    private int section;
    private Course theCourse;
    private ArrayList<Registration> studentList;
    private int studentsInOffering;

    public Offering(int section) {
        this.section = section;
        studentList = new ArrayList<>();
    }

    public void addStudent(Registration r) {
        studentList.add(r);
        studentsInOffering++;
        if (studentsInOffering < 8) {
            System.out
                    .println(
                            "You are currently student #" + studentsInOffering
                                    + " enrolled in the course, the course needs 8 students to run");
        }
    }

    public void removeStudent(Registration r) {
        studentList.remove(r);
        studentsInOffering--;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public void setTheCourse(Course theCourse) {
        this.theCourse = theCourse;
    }

    public String getCourseName() {
        return theCourse.getCourseName();
    }

    public int getCourseID() {
        return theCourse.getCourseId();
    }

    public Course getTheCourse() {
        return theCourse;
    }

    public int getStudentsInOffering() {
        return studentsInOffering;
    }

    public String print() {
        String s = theCourse.printCourseNameAndID();
        return s;
    }

    @Override
    public String toString() {
        return "section# " + section;
    }
}
