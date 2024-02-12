package gr.aueb.cf.ch13;

/**
 * Demonstrates the User class which is a JavaBean.
 * Contains a public API.
 */
public class User {
    /**
     * Contains the user credentials, an id number, and the full name
     * of the app User.
     */
    long id;
    String firstname;
    String lastname;


    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * Overloaded constructor
     * @param id which is the user's id number
     * @param firstname which is user's firstname
     * @param lastname which is user's lastname
     */
    public User(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * Id getter
     * @return returns user id
     */
    public long getId() {
        return id;
    }

    /**
     * Id setter
     * @param id
     */
    public void setId(long id) {
        this.id = id;
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
}
