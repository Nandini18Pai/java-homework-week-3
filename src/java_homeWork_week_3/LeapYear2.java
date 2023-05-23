package java_homeWork_week_3;
/**
 * Write a java program to input any year like (ex. 2007) and find out if it is leap year or not?
 */

import java.util.Scanner;

public class LeapYear2 {
    public void leapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Year = ");
        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) !=0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if (x && (y || z)){
            System.out.println(year + " is a Leap Year");
        }
        else {
            System.out.println(year + " is not a Leap year");
        }
    }

    public static void main(String[] args) {
        LeapYear2 obj = new LeapYear2();
        obj.leapYear();
    }
}
