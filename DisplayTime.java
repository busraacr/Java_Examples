//Write a program that obtains minutes and remaining seconds from seconds. 

import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        int hour=0,tmp=0;

        while(sec>0){
            tmp = sec %60;
            hour=sec/60;
            sec=sec - 60*hour - tmp;
        }
        
        System.out.println(hour+" hour "+ tmp +" min " );
        sc.close();
    }
}
