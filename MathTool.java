//This example creates a program to let a first grader practice additions. 
//The program randomly generates two single-digit integers number1 and number2 
//and displays a question such as “What is 7 + 9?” to the student. 
//After the student types the answer, the program displays a message to indicate whether the answer is true or false.

import java.util.Random;
import java.util.Scanner;

public class MathTool {
    public static void main(String[] args) {

        int result=0;
        Random rand =new Random();
        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(100);

        System.out.printf("What is " + num1 + "+" + num2 + "?");

        result=num1+num2;
        Scanner input = new Scanner(System.in);
        int num =input.nextInt();

        if(num==result){
            System.out.println("The answer is true ");
        }else{
            System.out.println("The answer is false ");
        }
        input.close();
    }
}