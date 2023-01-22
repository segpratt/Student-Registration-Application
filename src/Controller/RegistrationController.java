package Controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.RegistrationView;
import model.RegistrationModel;

public class RegistrationController {

    private RegistrationView theView;
    private RegistrationModel theModel;

    public RegistrationController(RegistrationView theView, RegistrationModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        theView.addMenuOptionListener1(new MenuOption1Listener());
        theView.addMenuOptionListener2(new MenuOption2Listener());
        theView.addMenuOptionListener3(new MenuOption3Listener());
        theView.addMenuOptionListener4(new MenuOption4Listener());
        theView.addMenuOptionListener5(new MenuOption5Listener());
        theView.addMenuOptionListener6(new MenuOption6Listener());
        theView.addMenuOptionListener7(new MenuOption7Listener());

    }

    class MenuOption1Listener extends Component implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int courseId;
            String courseName;
            try {
                courseId = theView.getCourseId1();
                courseName = theView.getCourseName1();
                String s = theModel.searchCatalogue(courseName, courseId);
                if (s.equals("null")) {
                    theView.displayMessage(
                            "Course: " + courseName + ", Course Id: " + courseId + ", not found in course catalogue");
                } else {
                    theView.setTheResult1(s);
                }
            } catch (Exception ex) {
                theView.displayMessage("Please enter letters for course name \nand numbers for course id/section");
            }
        }
    }

    class MenuOption2Listener extends Component implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int courseId;
            String courseName;
            int section;
            try {
                courseId = theView.getCourseId2();
                courseName = theView.getCourseName2();
                section = theView.getSection2();
                String s = theModel.searchCatalogue(courseName, courseId);
                if (s.equals("null")) {
                    theView.displayMessage(
                            "Course: " + courseName + ", Course Id: " + courseId + ", not found in course catalogue");
                } else if (theModel.getStudentCourseQuantity() >= 6) {
                    theView.displayMessage(
                            "Cannot register for more than 6 courses");
                } else if (theModel.studentCourseFinder(courseName, courseId) != null) {
                    theView.displayMessage(
                            "Cannot register for the same class / section");
                } else {
                    theModel.registerForCourse(courseName, courseId, section);
                    if (theModel.getStudentsInOffering(courseName, courseId) < 8) {
                        theView.displayMessage(
                                "You are currently student #" + theModel.getStudentsInOffering(courseName, courseId)
                                        + " enrolled in the course\nthe course needs 8 students to run you have been \nenrolled for the time being and will be notified closer\nto the start date if the class will run");
                    }
                }
            } catch (Exception ex) {
                theView.displayMessage("Please enter letters for course name \nand numbers for course id/section");
            }

        }
    }

    class MenuOption3Listener extends Component implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int courseId;
            String courseName;
            try {
                courseId = theView.getCourseId3();
                courseName = theView.getCourseName3();
                if (theModel.searchStudentCourses(courseName, courseId).equals("null")) {
                    theView.displayMessage(
                            "Course: " + courseName + ", Course Id: " + courseId + ", not found in students courses");
                } else {
                    theModel.removeCourse(courseName, courseId);
                }
            } catch (Exception ex) {
                theView.displayMessage("Please enter letters for course name \nand numbers for course id/section");
            }

        }
    }

    class MenuOption4Listener extends Component implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = theModel.viewCoursesInCatalogue();
            theView.setTheResult4(s);
        }
    }

    class MenuOption5Listener extends Component implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = theModel.viewCoursesTakenByStudent();
            theView.setTheResult5(s);
        }
    }

    class MenuOption6Listener extends Component implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            theView.dispose();
        }
    }

    class MenuOption7Listener extends Component implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            theView.clearTextFields();
        }
    }
}
