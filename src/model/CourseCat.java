package model;

import java.util.ArrayList;

public class CourseCat {

    ArrayList<Course> courseList;

    public CourseCat(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public Course searchCat(String courseName, int courseId) {
        for (Course c : courseList) {
            if (c.getCourseName().equals(courseName) &&
                    c.getCourseId() == courseId) {
                return c;
            }
        }
        return null;
    }

    public String searchCatAndPrint(String courseName, int courseId) {
        String s = "";
        Course cat = searchCat(courseName, courseId);
        if (cat == null) {
            s = "Course not found in course catalogue";
        } else {
            s += cat;
        }
        return s;
    }

    @Override
    public String toString() {
        return "Course Catalogue:\n" +
                "Course List: " + courseList;
    }
}
