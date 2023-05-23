package java_homeWork_week_3;

/***
 * Write a Java program which input any number between 1 to 7 and it print The Days
 *         name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 *         NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */


import java.util.Scanner;

public class WeekDays13 {

    public static void main(String[] args) {
        WeekDays13 weekContainPro13 = new WeekDays13();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input any number between 1 to 7");
        String enterNumber = sc.nextLine();
        weekContainPro13.printWeekdaysName(enterNumber);

    }

    private void printWeekdaysName(String weekDaysName) {
        switch (weekDaysName) {
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
                System.out.println("Saturday");
                break;
            case "7":
                System.out.println("sunday");
                break;
            default:
                System.out.println("Week contains only 1 to 7 days:");
                break;

        }


    }
}


