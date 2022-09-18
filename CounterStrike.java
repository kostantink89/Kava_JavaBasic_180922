package lesson4;

import java.util.Scanner;

public class CounterStrike {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your first team name: ");
        String teamOne = scan.nextLine();
        System.out.println("Please enter frag amount for each player in the team " + teamOne + ":");
        float firstFragTeamOne, secondFragTeamOne, thirdFragTeamOne, fourthFragTeamOne, fifthFragTeamOne;
        System.out.print("First player frags: ");
        firstFragTeamOne = scan.nextFloat();
        System.out.print("Second player frags: ");
        secondFragTeamOne = scan.nextFloat();
        System.out.print("Third player frags: ");
        thirdFragTeamOne = scan.nextFloat();
        System.out.print("Fourth player frags: ");
        fourthFragTeamOne = scan.nextFloat();
        System.out.print("Fifth player frags: ");
        fifthFragTeamOne = scan.nextFloat();

        System.out.println();
        scan.nextLine();

        System.out.print("Please enter your second team name: ");
        String teamTwo = scan.nextLine();
        System.out.println("Please enter frag amount for each player in the team " + teamTwo + ":");
        float firstFragTeamTwo, secondFragTeamTwo, thirdFragTeamTwo, fourthFragTeamTwo, fifthFragTeamTwo;
        System.out.print("First player frags: ");
        firstFragTeamTwo = scan.nextFloat();
        System.out.print("Second player frags: ");
        secondFragTeamTwo = scan.nextFloat();
        System.out.print("Third player frags: ");
        thirdFragTeamTwo = scan.nextFloat();
        System.out.print("Fourth player frags: ");
        fourthFragTeamTwo = scan.nextFloat();
        System.out.print("Fifth player frags: ");
        fifthFragTeamTwo = scan.nextFloat();

        float teamOneArithmeticMeanResult = (firstFragTeamOne + secondFragTeamOne + thirdFragTeamOne +
                fourthFragTeamOne + fifthFragTeamOne) / 5;

        float teamTwoArithmeticMeanResult = (firstFragTeamTwo + secondFragTeamTwo + thirdFragTeamTwo +
                fourthFragTeamTwo + fifthFragTeamTwo) / 5;

        if (teamOneArithmeticMeanResult > teamTwoArithmeticMeanResult) {
            System.out.println("\nThe winning team is: " + teamOne + "\nScored: " + Math.round(teamOneArithmeticMeanResult) + " points ");
        } else if (teamOneArithmeticMeanResult < teamTwoArithmeticMeanResult) {
            System.out.println("\nThe winning team is: " + teamTwo + "\nScored: " + Math.round(teamTwoArithmeticMeanResult) + " points ");
        } else {
            System.out.println("\nThe friendship won.It's a draw.");
        }


    }
}
