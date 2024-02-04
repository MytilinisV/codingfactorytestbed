package gr.aueb.cf.ch2;

import java.util.Random;

public class RandomDiceApp {
    public static void main(String[] args) {
        int die1 = (int) (Math.random() * 6) + 1; // * (max - min + 1) + min
        int die2 = (int) (Math.random() * 6) + 1;

        System.out.printf("Die 1: %d, Die2: %d",
                die1, die2);
    }
}
