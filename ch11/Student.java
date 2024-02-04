package gr.aueb.cf.ch11;

import java.util.Scanner;

/**
 * A simple class definition.
 * Student Javabean
 * Data class + default constructor + setters / getters.
 *
 */
public class Student {
    private static int instancesCount = 0;
    private int id;
    private String firstname;
    private String lastname;
    private static Scanner in;

    static {
        in = new Scanner(System.in);
        int num = in.nextInt();
        instancesCount = (num == 1) ? 1 : 0;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Default constructor
    public Student() {
        instancesCount++;
    }

    // Overloaded constructor
    public Student(int id, String firstname, String lastname) {
        instancesCount++;
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // alt + insert

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public static int getInstancesCount() {
        return instancesCount;
    }
    //    public int getId() {
//        return id;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
}
