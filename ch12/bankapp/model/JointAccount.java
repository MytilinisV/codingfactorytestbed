package gr.aueb.cf.ch12.bankapp.model;

/**
 * An Immutable class for a joint bank account
 * that allows two owners with a shared total balance.
 */
public final class JointAccount {
    private final String iban;
    private final String firstname1;
    private final String lastname1;
    private final String firstname2;
    private final String lastname2;
    private double totalBalance;

    /**
     * Initializes a new joint bank account
     */
    public JointAccount() {
        iban = "";
        firstname1 = "";
        lastname1 = "";
        firstname2 = "";
        lastname2 = "";
    }

    /**
     * Constructs a new joint bank account
     * @param iban which is the IBAN number
     * @param firstname1 which is the first name of Owner 1
     * @param lastname1 which is the last name of Owner 1
     * @param firstname2 which is the first name of Owner 2
     * @param lastname2 which is the last name of Owner 2
     * @param totalBalance which is the total balance of the shared account
     */
    public JointAccount(String iban, String firstname1, String lastname1, String firstname2, String lastname2, double totalBalance) {
        this.iban = iban;
        this.firstname1 = firstname1;
        this.lastname1 = lastname1;
        this.firstname2 = firstname2;
        this.lastname2 = lastname2;
        this.totalBalance = totalBalance;
    }

    /**
     * gets the IBAN number
     * @return the IBAN number
     */
    public String getIban() {
        return iban;
    }

    /**
     * gets Owner's #1 firstname
     * @return Owner's #1 firstname
     */
    public String getFirstname1() {
        return firstname1;
    }

    /**
     * gets Owner's #1 lastname
     * @return Owner's #1 lastname
     */
    public String getLastname1() {
        return lastname1;
    }

    /**
     * gets Owner's #2 firstname
     * @return Owner's #2 firstname
     */
    public String getFirstname2() {
        return firstname2;
    }

    /**
     * gets Owner's #2 lastname
     * @return Owner's #2 lastname
     */
    public String getLastname2() {
        return lastname2;
    }

    /**
     * gets the total balance of joint's account
     * @return total balance of joint's account
     */
    public double getTotalBalance() {
        return totalBalance;
    }

    /**
     * sets the total balance of joint's account
     * @param totalBalance the balance of joint's account
     */
    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    @Override
    public String toString() {
        return "JointAccount: " + '\n' + "iban: " + iban + '\n'
                + "Owner's First Name: " + firstname1 + '\n' + "Owner's Last Name: " + lastname1 + '\n'
                + "Joint Owner's First Name: " + firstname2 + '\n' + "Joint Owner's Last Name: " + lastname2 + '\n'
                + "Balance: " + String.format("%.2f", totalBalance);
    }
}
