package View;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;

public class RegistrationView extends JFrame {
    private JButton menuOption1Button = new JButton("1. Search for a course in the catalogue");
    private JLabel courseNameLab1 = new JLabel("Course name:");
    private JLabel courseIdLab1 = new JLabel("Course ID:");
    private JTextField courseNameTxt1 = new JTextField(10);
    private JTextField courseIdTxt1 = new JTextField(10);
    private JTextField result1 = new JTextField();
    private JButton menuOption2Button = new JButton("2. Add a course to students courses");
    private JLabel courseNameLab2 = new JLabel("Course name:");
    private JLabel courseIdLab2 = new JLabel("Course ID:");
    private JLabel sectionLab2 = new JLabel("Section:");
    private JTextField courseNameTxt2 = new JTextField(10);
    private JTextField courseIdTxt2 = new JTextField(10);
    private JTextField sectionTxt2 = new JTextField(10);
    private JButton menuOption3Button = new JButton("3. Remove a course from student courses");
    private JLabel courseNameLab3 = new JLabel("Course name:");
    private JLabel courseIdLab3 = new JLabel("Course ID:");
    private JTextField courseNameTxt3 = new JTextField(10);
    private JTextField courseIdTxt3 = new JTextField(10);
    private JButton menuOption4Button = new JButton("4. View all courses in the catalogue");
    private JTextArea result4 = new JTextArea();
    private JButton menuOption5Button = new JButton("5. View all courses taken by the student");
    private JTextArea result5 = new JTextArea();
    private JButton menuOption6Button = new JButton("6. Quit");
    private JButton menuOption7Button = new JButton("7. Clear all text");

    public RegistrationView() {
        
        this.setTitle("Student Registration");
        this.setSize(820, 860);
        this.setLocationRelativeTo(null);
        JPanel regPanel = new JPanel();
        regPanel.setLayout(null);
        regPanel.add(menuOption1Button).setBounds(0, 0, 280, 30);
        regPanel.add(courseNameLab1).setBounds(280, 0, 90, 30);
        regPanel.add(courseNameTxt1).setBounds(370, 0, 100, 30);
        regPanel.add(courseIdLab1).setBounds(470, 0, 70, 30);
        regPanel.add(courseIdTxt1).setBounds(540, 0, 100, 30);
        result1.setEditable(false);
        result1.setBorder(new LineBorder(Color.BLACK));
        result1.setBounds(10, 30, 800, 30);
        regPanel.add(result1);
        menuOption2Button.setHorizontalAlignment(SwingConstants.LEFT);
        regPanel.add(menuOption2Button).setBounds(0, 60, 280, 30);
        regPanel.add(courseNameLab2).setBounds(280, 60, 90, 30);
        regPanel.add(courseNameTxt2).setBounds(370, 60, 100, 30);
        regPanel.add(courseIdLab2).setBounds(470, 60, 70, 30);
        regPanel.add(courseIdTxt2).setBounds(540, 60, 100, 30);
        regPanel.add(sectionLab2).setBounds(640, 60, 56, 30);
        regPanel.add(sectionTxt2).setBounds(696, 60, 80, 30);
        regPanel.add(menuOption3Button).setBounds(0, 90, 296, 30);
        regPanel.add(courseNameLab3).setBounds(296, 90, 90, 30);
        regPanel.add(courseNameTxt3).setBounds(386, 90, 100, 30);
        regPanel.add(courseIdLab3).setBounds(486, 90, 70, 30);
        regPanel.add(courseIdTxt3).setBounds(556, 90, 100, 30);
        menuOption4Button.setHorizontalAlignment(SwingConstants.LEFT);
        regPanel.add(menuOption4Button).setBounds(0, 120, 280, 30);
        result4.setEditable(false);
        result4.setBorder(new LineBorder(Color.BLACK));
        JScrollPane sp2 = new JScrollPane(result4);
        sp2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        sp2.setBounds(10, 150, 800, 200);
        regPanel.add(sp2);
        menuOption5Button.setHorizontalAlignment(SwingConstants.LEFT);
        regPanel.add(menuOption5Button).setBounds(0, 350, 280, 30);
        result5.setEditable(false);
        result5.setBorder(new LineBorder(Color.BLACK));
        JScrollPane sp3 = new JScrollPane(result5);
        sp3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        sp3.setBounds(10, 380, 800, 200);
        regPanel.add(sp3);
        regPanel.add(menuOption6Button).setBounds(0, 580, 280, 30);
        regPanel.add(menuOption7Button).setBounds(0, 610, 280, 30);
        this.add(regPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addMenuOptionListener1(ActionListener listenForMenuOption1) {
        menuOption1Button.addActionListener(listenForMenuOption1);
    }

    public void addMenuOptionListener2(ActionListener listenForMenuOption2) {
        menuOption2Button.addActionListener(listenForMenuOption2);
    }

    public void addMenuOptionListener3(ActionListener listenForMenuOption3) {
        menuOption3Button.addActionListener(listenForMenuOption3);
    }

    public void addMenuOptionListener4(ActionListener listenForMenuOption4) {
        menuOption4Button.addActionListener(listenForMenuOption4);
    }

    public void addMenuOptionListener5(ActionListener listenForMenuOption5) {
        menuOption5Button.addActionListener(listenForMenuOption5);
    }

    public void addMenuOptionListener6(ActionListener listenForMenuOption6) {
        menuOption6Button.addActionListener(listenForMenuOption6);
    }

    public void addMenuOptionListener7(ActionListener listenForMenuOption7) {
        menuOption7Button.addActionListener(listenForMenuOption7);
    }

    public String getCourseName1() {
        return courseNameTxt1.getText();
    }

    public int getCourseId1() {
        return Integer.parseInt(courseIdTxt1.getText());
    }

    public String getCourseName2() {
        return courseNameTxt2.getText();
    }

    public int getCourseId2() {
        return Integer.parseInt(courseIdTxt2.getText());
    }

    public int getSection2() {
        return Integer.parseInt(sectionTxt2.getText());
    }

    public String getCourseName3() {
        return courseNameTxt3.getText();
    }

    public int getCourseId3() {
        return Integer.parseInt(courseIdTxt3.getText());
    }

    public void setTheResult1(String res) {
        result1.setText(res);
    }

    public void setTheResult4(String res) {
        result4.setText(res);
    }

    public void setTheResult5(String res) {
        result5.setText(res);
    }

    public void displayMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

    public void clearTextFields() {
        courseNameTxt1.setText("");
        courseIdTxt1.setText("");
        courseNameTxt2.setText("");
        courseIdTxt2.setText("");
        sectionTxt2.setText("");
        courseNameTxt3.setText("");
        courseIdTxt3.setText("");
        result1.setText("");
        result4.setText("");
        result5.setText("");
    }
}
