package lesson4;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your number from 1 to 6: ");
        int number = scan.nextInt();
        double randomNumber = (Math.random() * 6)+1;
        int integer = (int) randomNumber;

        if (number == integer) {
            System.out.println("Congratulations! You got it!");
        } else {
            System.out.println("Sorry you missed.The guessed number was: " + integer);
        }


    }
}
