package gr.aueb.cf.ch17.model;

public class Main {

    public static void main(String[] args) {
        User vasilis = new User(2, "Vasilis", "Mytilinis");
        UserCredentials vasilisCredentials = new UserCredentials(4051, "Valley", "5^4^3^2^1");

        System.out.println("ID: " + vasilis.getId() + ", " + "First Name: " + vasilis.getFirstname() + ", " + "Last Name: " + vasilis.getLastname());
        System.out.println("ID: " + vasilisCredentials.getId() + ", " + "Username: " + vasilisCredentials.getUsername() + ", " + "Password: " + vasilisCredentials.getPassword());

    }
}
