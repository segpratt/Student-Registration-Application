package model;

import java.util.ArrayList;

public class Student {

    private String name;
    private int id;
    private int courseQuantity;
    private ArrayList<Registration> courseList;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        courseList = new ArrayList<>();
    }

    public void addCourse(Registration r) {
        courseList.add(r);
    }

    public void removeCourse(Registration r) {
        courseList.remove(r);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentCourseQuantity() {
        return courseQuantity;
    }

    public int getStudentsInOffering(String courseName, int courseId) {
        int numberOfStudentsInOffering = 0;
        for (Registration reg : courseList) {
            if (reg.getCourseName().equals(courseName) &&
                    reg.getCourseID() == courseId) {
                numberOfStudentsInOffering = reg.getStudentsInOffering();
            }
        }
        return numberOfStudentsInOffering;

    }

    public void registerForCourse(CourseCat cat, String courseName, int courseId, int secNumber) {
        Course myCourse = cat.searchCat(courseName, courseId);
        if (myCourse == null) {
            System.out.println("\n** Course not found in course Catalougue **\n");
        } else if (courseQuantity >= 6) {
            System.out.println("\n** Cannot register for more than 6 courses **\n");
        } else if (studentCourseFinder(courseName, courseId) == null) {
            Offering theOffering = myCourse.getOffering(secNumber);
            Registration reg = new Registration();
            reg.register(this, theOffering);
            courseQuantity++;
        }
    }

    public Registration studentCourseFinder(String courseName, int courseId) {
        for (Registration reg : courseList) {
            if (reg.getCourseName().equals(courseName) &&
                    reg.getCourseID() == courseId) {
                return reg;
            }
        }
        return null;
    }

    public void unRegisterForCourse(String courseName, int courseId) {
        Registration reg = studentCourseFinder(courseName, courseId);
        if (reg == null) {
            System.out.println("\n** Course not found in currently registered course list **\n");
        } else {
            Offering theOffering = reg.getOffering();
            reg.unregister(this, theOffering);
            courseQuantity--;
        }
    }

    @Override
    public String toString() {
        return "Student information: " +
                "\nName: '" + name + '\'' +
                ", ID: " + id +
                "\nCurrently registered courses: " +
                courseList;
    }
}
