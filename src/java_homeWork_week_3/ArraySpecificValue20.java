package java_homeWork_week_3;

import java.util.Scanner;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class ArraySpecificValue20 {

    public static void contains() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number ");
        int num = sc.nextInt();

        int[] array1 = {23, 45, 6, 56, 77, 85, };
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == num) {
                int result = num;
                System.out.println(result);
            }
        }
        }

    public static void main(String[] args)
    {
        contains();
    }
        }
