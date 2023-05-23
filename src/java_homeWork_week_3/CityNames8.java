package java_homeWork_week_3;

import java.util.Scanner;
/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class CityNames8 {

    public static void main(String[] args) {
        CityNames8 cityNameProg8 = new CityNames8();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Alphabet");
        String alphabet = sc.next();
        cityNameProg8.printCityName(alphabet);
    }
    private void printCityName(String alphabet) {
        if (alphabet.equals("A")) {
            System.out.println("Abington");
        } else if (alphabet.equals("B")) {
            System.out.println("Bath");
        } else if (alphabet.equals("C")) {
            System.out.println("Castle");
        } else if (alphabet.equals("D")) {
            System.out.println("Dartford");
        } else if (alphabet.equals("E")) {
            System.out.println("Epsom");
        } else if (alphabet.equals("F")) {
            System.out.println("Fenny");
        } else {
            System.out.println("alphabet should be invalid entry:");
        }
    }
}


