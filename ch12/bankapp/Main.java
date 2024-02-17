package gr.aueb.cf.ch12.bankapp;


import gr.aueb.cf.ch12.bankapp.model.JointAccount;
import gr.aueb.cf.ch12.bankapp.model.OverdraftAccount;

public class Main {

    public static void main(String[] args) {
        OverdraftAccount user = new OverdraftAccount("1234", "Vasilis", "Mytilinis", 1200.2);
        JointAccount jointUsers = new JointAccount("5678", "Xatzis", "Thomas", "Vasilis", "Mytilinis", 2300.2);
        double withdrawal = 1300;
//        double newBalance;

        user.setBalance(user.getBalance() - withdrawal);
//        newBalance = user.getBalance() - withdrawal;
//        user.setBalance(newBalance);

        System.out.println(user.toString() + '\n');
        System.out.println(jointUsers);
    }
}
