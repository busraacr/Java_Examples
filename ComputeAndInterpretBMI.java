//Wite a program that calculate Body Mass Index and interpret it.

import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {

        double BMI=0;
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your age");
        int age =input.nextInt();
        System.out.println("Enter your weight in kilograms");
        double weight =input.nextDouble();
        System.out.println("Enter your height in centimeters");
        double height =input.nextDouble();

        BMI=(weight/(height*height));

        if(age>16){
            if(BMI <18.5){
                System.out.println("Underweight");
            }else if(BMI<25.0 ){
                System.out.println("Normal");
            }else if(BMI<30.0){
                System.out.println("Overweight");
            }else if(age<16){
                System.out.println("Can't be measurable");
            }else{
                System.out.println("Obese");
            }
        }
        input.close();
    }
}
