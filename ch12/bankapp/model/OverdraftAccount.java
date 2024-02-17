package gr.aueb.cf.ch12.bankapp.model;

public final class OverdraftAccount {
        private final String iban;
        private final String firstname;
        private final String lastname;
        private double balance;

    public OverdraftAccount(){
        iban = "";
        firstname = "";
        lastname = "";
    }

    public OverdraftAccount(String iban, String firstname, String lastname, double balance) {
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "OverdraftAccount: " + '\n' + "iban: " + iban + '\n' + "First Name: " + firstname + '\n' + "Last Name: " + lastname + '\n' + "Balance: " + String.format("%.2f", balance);
    }
}
