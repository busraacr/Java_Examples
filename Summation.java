import java.util.Scanner;

public class Summation {
    public static void main(String[] args) { 

        double sum;
        Scanner n1 = new Scanner(System.in);

        System.out.println("enter a num ");
        double num1 = n1.nextDouble();

        System.out.println("enter a num ");
        double num2 = n1.nextDouble();
        
        System.out.println("enter a num ");
        double num3 = n1.nextDouble();

        sum= num1+num2+num3;
        System.out.println("summation " + sum);
        n1.close();
    }
}

