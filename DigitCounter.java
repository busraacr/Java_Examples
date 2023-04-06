//Write a program that prints the digits in reverse order and counts the digits of entered number 
import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {

        System.out.println("enter num");
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int tmp,count=0;

        while(num>0){
            tmp= num%10;
            num=num/ 10;
            count++;
            System.out.print(tmp+ " ");
        }
        
        System.out.println("\ndigit number is " + count);
        s.close();
    }
}
