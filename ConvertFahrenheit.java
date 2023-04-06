//Write a program that converts a Fahrenheit degree to Celsius using the formula:
//cel=((5.0/9) * (f-32));

import java.util.Scanner;

public class ConvertFahrenheit {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int f = sc.nextInt();
        double cel=0;
        cel=((5.0/9) * (f-32));
        
        System.out.println(cel+" celcius");
        sc.close();
    }
}
