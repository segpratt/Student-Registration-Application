package model;

public class RegistrationModel {
    private CourseCat cat;
    private Student student;

    public RegistrationModel() {
        this.cat = new CourseCat(DataLoader.loadCoursesFromDataBase());
        this.student = new Student("Stewart", 30073940);
        Student student1 = new Student("Stephen", 30073941);
        Student student2 = new Student("Braden", 30073943);
        Student student3 = new Student("Courtney", 30073944);
        Student student4 = new Student("Jacob", 30073945);
        Student student5 = new Student("Jake", 30073946);
        Student student6 = new Student("Pat", 30073947);
        Student student7 = new Student("Matt", 30073949);
        student1.registerForCourse(cat, "ENGG", 683, 1);
        student2.registerForCourse(cat, "ENGG", 683, 1);
        student3.registerForCourse(cat, "ENGG", 683, 1);
        student4.registerForCourse(cat, "ENGG", 683, 1);
        student5.registerForCourse(cat, "ENGG", 683, 1);
        student6.registerForCourse(cat, "ENGG", 683, 1);
        student7.registerForCourse(cat, "ENGG", 683, 1);
    }

    public String searchCatalogue(String name, int courseid) {
        String s = "";
        s += cat.searchCat(name, courseid);
        return s;
    }

    public int getStudentCourseQuantity() {
        return student.getStudentCourseQuantity();
    }

    public int getStudentsInOffering(String name, int courseid) {
        return student.getStudentsInOffering(name, courseid);
    }

    public void registerForCourse(String name, int courseid, int section) {
        student.registerForCourse(this.cat, name, courseid, section);
    }

    public String searchStudentCourses(String name, int courseid) {
        String s = "";
        s += student.studentCourseFinder(name, courseid);
        return s;
    }

    public void removeCourse(String name, int courseid) {
        student.unRegisterForCourse(name, courseid);
    }

    public Registration studentCourseFinder(String courseName, int courseId) {
        Registration r = student.studentCourseFinder(courseName, courseId);
        return r;
    }

    public String viewCoursesInCatalogue() {
        String s = "";
        s += cat;
        return s;
    }

    public String viewCoursesTakenByStudent() {
        String s = "";
        s += student;
        return s;
    }

}
