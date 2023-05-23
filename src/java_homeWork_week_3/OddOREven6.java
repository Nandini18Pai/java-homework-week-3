package java_homeWork_week_3;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class OddOREven6 {
    public void oddOrEven() {
        Scanner num = new Scanner(System.in);
        System.out.print(" Insert any number :  ");
        int x = num.nextInt();
        num.close();
        if (x % 2 == 0)
        {
            System.out.println( x + " This number is even number");
        }
        else
        {
            System.out.println( x + " This number is odd number");
        }
    }
    public static void main(String[] args) {
        OddOREven1 obj = new OddOREven1();
        obj.oddOrEven();
    }
}
