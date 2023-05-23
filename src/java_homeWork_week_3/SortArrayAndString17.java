package java_homeWork_week_3;

import java.util.Arrays;

public class SortArrayAndString17 {

    public static void arrayString() {
        int[] array1 = {23, 45, 6, 56, 77, 85, 96, 12, 65, 45, 36, 25};
        String[] array2 = {"amit", "riya", "krina ", "hema", "donal", "raju"};
        System.out.println("Original value : " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted Value : " + Arrays.toString(array1));
        System.out.println("Original value : " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted Value : " + Arrays.toString(array2));
    }
    public static void main(String[] args) {
        arrayString();
    }

}
