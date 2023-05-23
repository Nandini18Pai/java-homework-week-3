package java_homeWork_week_3;

/**
 *Write a program that tells us input value is number or an alphabet or symbol.
 */
import java.util.Scanner;

public class NumberAlpha12 {

        public static void main(String[] args) {
            NumberAlpha12 obj = new NumberAlpha12();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number/alphabet/symbol");
            char value = sc.next().charAt(0);
            obj.verify(value);
        }
        private void verify(char value) {
            if (Character.isDigit(value)) {
                System.out.println("Input character is digit");
            } else if (Character.isLetter(value)) {
                System.out.println("Input character is letter");
            } else {
                System.out.println("Input character is symbol");
            }
        }
    }


