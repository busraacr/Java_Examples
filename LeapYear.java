//This program first prompts the user to enter a year as an int value and checks if it is a leap year.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("This year is a leap year");
        }else {
            System.out.println("This year is not a leap year");
        }
        input.close();
    }
}
