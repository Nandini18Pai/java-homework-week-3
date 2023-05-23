package java_homeWork_week_3;

/**
 * Write a java program that tells us that numbers is odd or even?
 * Hint : Use ternary operator(? :)
 */

import java.util.Scanner;

public class OddOREven1 {
    public void oddOrEven() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number = ");
        int a = sc.nextInt();
        sc.close();
        String result = (a%2 == 0) ? "Even number " : "Odd number";
        System.out.println(result);
    }
    public static void main(String[] args) {
        OddOREven1 obj = new OddOREven1();
        obj.oddOrEven();
    }
}
