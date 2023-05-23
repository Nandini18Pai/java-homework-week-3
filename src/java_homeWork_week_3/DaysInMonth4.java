package java_homeWork_week_3;

import java.util.Scanner;

public class DaysInMonth4 {
    public boolean isLeapYear(int year) {

        boolean validYear = year > 1 && year <= 9999;
        if (validYear) {
            boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
            if (isLeapYear) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    public int getDaysMonth(int month, int year) {
        boolean validMonth = month >=1 && month <= 12;

        boolean validYear = year >= 1 && year <= 9999;

        if (validMonth && validYear) {
            switch (month) {
                case 1:
                    return 31;
                case 2:
                    boolean isLeapYear = isLeapYear(year);
                    if (isLeapYear) {
                        return 29;
                    } else {
                        return 28;
                    }
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;
                case 11:
                    return 30;
                case 12:
                    return 31;
            }

        } else {
            return -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        DaysInMonth4 obj = new DaysInMonth4();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year :");
        int year = sc.nextInt();
        boolean isLeapYear = obj.isLeapYear(year);
        System.out.println("This Leap Year : " + isLeapYear);
        System.out.println("Enter Month :");
        int month = sc.nextInt();
        int dayOfMonth = obj.getDaysMonth(month, year);
        System.out.println("day Of Month : " + dayOfMonth);

    }

}





