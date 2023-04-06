//This program first prompts the user to enter a year as an int value and checks if it is a leap year.
//If the user input matches the lottery in exact order, the award is $10,000.
//If the user input matches the lottery, the award is $3,000.
//If one digit in the user input matches a digit in the lottery, the award is $1,000.

import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        
        Random rand =new Random();
        int num1 = rand.nextInt(100);

        System.out.println("Enter two-digit number ");
        Scanner input=new Scanner(System.in);
        int num2=input.nextInt();
            
        int lotteryDigit1 = num1 / 10;
        int lotteryDigit2 = num1 % 10;
        int guessDigit1 = num2 / 10;
        int guessDigit2 = num2 % 10; 

        if (num1 == num2) {
            System.out.println("You won $10,000.");
        } else if (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1) {
            System.out.println("You won $3,000.");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2
            || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
            System.out.println("You won $1,000.");
        } else {
            System.out.println("No match. Try again next time.");
            System.out.println("The number was " + num1 + " and your input was " + num2);
        }
        input.close();
    }
}
