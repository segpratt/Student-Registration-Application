package model;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private int courseId;
    private ArrayList<Course> preReqs;
    private ArrayList<Offering> offeringList;

    public Course(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.offeringList = new ArrayList<Offering>();
        this.preReqs = new ArrayList<Course>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setPreReqs(ArrayList<Course> preReqs) {
        // this.preReqs = preReqs;
        for (Course c : preReqs)
            this.preReqs.add(c);
    }

    public Offering getOffering(int i) {
        return offeringList.get(i - 1);
    }

    public void setOfferingList(ArrayList<Offering> offeringList) {
        for (Offering offering : offeringList) {
            offering.setTheCourse(this);
            this.offeringList.add(offering);
        }
    }

    public String printPrerequs() {
        String s = "";
        for (Course c : this.preReqs) {
            s += c.getCourseName() + " " + c.getCourseId() + ", ";
        }
        return s;
    }

    public String printCourseNameAndID() {
        String s = "\nCourse Description: " +
                "Course Name: " + courseName +
                ", Course ID: " + courseId;
        return s;
    }

    @Override
    public String toString() {
        return "\nCourse Description: " +
                "Course Name: " + courseName +
                ", Course ID: " + courseId +
                ", PreReqs: [" + printPrerequs() + "]" +
                ", Offerings: " + offeringList;
    }
}
