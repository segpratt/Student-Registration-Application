package model;

import java.util.ArrayList;

public class DataLoader {

    // Helper method
    public static ArrayList<Course> loadCoursesFromDataBase() {
        Course c1 = new Course("ENGG", 683);
        Course c2 = new Course("ENGG", 681);
        Course c3 = new Course("ENGG", 684);
        Course c4 = new Course("ENGG", 687);
        Course c5 = new Course("ENSF", 629);
        Course c6 = new Course("ENSF", 637);
        Course c7 = new Course("ENSF", 643);
        Course c8 = new Course("ENSF", 609);

        Course prerequ1 = new Course("ENSF", 688);
        Course prerequ2 = new Course("ENSF", 602);
        Course prerequ3 = new Course("ENSF", 603);
        Course prerequ4 = new Course("ENSF", 676);
        Course prerequ5 = new Course("ENSF", 645);
        Course prerequ6 = new Course("ENSF", 655);
        Course prerequ7 = new Course("ENSF", 693);
        Course prerequ8 = new Course("ENSF", 608);

        ArrayList<Offering> offeringList1 = new ArrayList<Offering>();
        ArrayList<Offering> offeringList2 = new ArrayList<Offering>();
        ArrayList<Offering> offeringList3 = new ArrayList<Offering>();
        ArrayList<Offering> offeringList4 = new ArrayList<Offering>();
        ArrayList<Offering> offeringList5 = new ArrayList<Offering>();
        ArrayList<Offering> offeringList6 = new ArrayList<Offering>();
        ArrayList<Offering> offeringList7 = new ArrayList<Offering>();
        ArrayList<Offering> offeringList8 = new ArrayList<Offering>();

        offeringList1.add(new Offering(1));
        offeringList1.add(new Offering(2));
        offeringList2.add(new Offering(1));
        offeringList3.add(new Offering(1));
        offeringList4.add(new Offering(1));
        offeringList4.add(new Offering(2));
        offeringList5.add(new Offering(1));
        offeringList6.add(new Offering(1));
        offeringList7.add(new Offering(1));
        offeringList8.add(new Offering(1));
        offeringList8.add(new Offering(2));

        c1.setOfferingList(offeringList1);
        c2.setOfferingList(offeringList2);
        c3.setOfferingList(offeringList3);
        c4.setOfferingList(offeringList4);
        c5.setOfferingList(offeringList5);
        c6.setOfferingList(offeringList6);
        c7.setOfferingList(offeringList7);
        c8.setOfferingList(offeringList8);

        ArrayList<Course> prerequsList1 = new ArrayList<Course>();
        ArrayList<Course> prerequsList2 = new ArrayList<Course>();
        ArrayList<Course> prerequsList3 = new ArrayList<Course>();
        ArrayList<Course> prerequsList4 = new ArrayList<Course>();
        ArrayList<Course> prerequsList5 = new ArrayList<Course>();
        ArrayList<Course> prerequsList6 = new ArrayList<Course>();
        ArrayList<Course> prerequsList7 = new ArrayList<Course>();
        ArrayList<Course> prerequsList8 = new ArrayList<Course>();

        prerequsList1.add(prerequ1);
        prerequsList2.add(prerequ2);
        prerequsList2.add(prerequ3);
        prerequsList3.add(prerequ4);
        prerequsList4.add(prerequ5);
        prerequsList4.add(prerequ6);
        prerequsList5.add(prerequ7);
        prerequsList6.add(prerequ8);
        prerequsList7.add(prerequ4);
        prerequsList8.add(prerequ5);
        prerequsList8.add(prerequ6);

        c1.setPreReqs(prerequsList1);
        c2.setPreReqs(prerequsList2);
        c3.setPreReqs(prerequsList3);
        c4.setPreReqs(prerequsList4);
        c5.setPreReqs(prerequsList5);
        c6.setPreReqs(prerequsList6);
        c7.setPreReqs(prerequsList7);
        c8.setPreReqs(prerequsList8);

        ArrayList<Course> CourseList = new ArrayList<>();
        CourseList.add(c1);
        CourseList.add(c2);
        CourseList.add(c3);
        CourseList.add(c4);
        CourseList.add(c5);
        CourseList.add(c6);
        CourseList.add(c7);
        CourseList.add(c8);

        return CourseList;
    }

}
