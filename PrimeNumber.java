//Write a program that find the prime numbers.

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("enter num");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i=2;
        boolean isPrime = true;

        while(num>i){
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
        sc.close();
    }
}
