//Write a program that displays the sales tax with two digits after the decimal point.

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {

        System.out.print("Enter the amount of purchase: ");
        Scanner sc = new Scanner(System.in);

        double purchaseAmount = sc.nextDouble();
        final double SALES_TAX_RATE = 0.08;
        double salesTax = purchaseAmount * SALES_TAX_RATE;

        System.out.printf("The sales tax is $%.2f\n", salesTax);
        sc.close(); // close the scanner
    }
}
