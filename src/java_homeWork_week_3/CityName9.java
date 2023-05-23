package java_homeWork_week_3;

/**
 *  Same as above program-8 using switch statement.
 */

import java.util.Scanner;

public class CityName9 {
    public static void main(String[] args) {
        CityName9 statmentPro9 = new CityName9();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Any Alphabet");
        String alpha = scan.nextLine();
        statmentPro9.printCityName(alpha);
    }
    private void printCityName(String alpha) {
        switch (alpha) {
            case "A":
                System.out.println("Abington");
                break;
            case "B":
                System.out.println("Bath");
                break;
            case "C":
                System.out.println("Castle");
                break;
            case "D":
                System.out.println("Dartford");
                break;
            case "E":
                System.out.println("Epsom");
                break;
            case "F":
                System.out.println("Fenny");
                break;
            default:
                System.out.println("alphabet should be invalid entry:");
                break;
        }
    }
}

