// Write a program that prompts the user to enter an integer. 
//If the number is a multiple of 5, print HiFive. If the number is divisible by 2, print HiEven.

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        
        System.out.println("Enter a number ");
        Scanner input =new Scanner(System.in);
        int num =input.nextInt();

        if(num%5==0){
            System.out.println("HiFive");
        }else if (num%2==0){
            System.out.println("HiEven");
        }else {
            System.out.println("-1");
        }
        input.close();
    }
}
