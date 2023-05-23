package java_homeWork_week_3;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class SalaryAndCommission7 {
    public void salesCommission() {
        Scanner sc = new Scanner(System.in);
        System.out.println( " Enter Sales Id");
        int salesId = sc .nextInt();
        System.out.println( " Enter Seller's name ");
        String name = sc.next();
        System.out.println(" Enter Sales Amount");
        Double sales = sc.nextDouble();
        System.out.println(" Enter basic Salary ");
        Double basic = sc.nextDouble();
        sc.close();

        if (sales >= 50000) {
            System.out.println(" Commission " +  (sales * 35) / 100);
        } else if (sales >= 30000) {
            System.out.println(" Commission " +  (sales * 20) / 100);
        } else if (sales >= 20000) {
            System.out.println(" Commission " +  (sales * 10) / 100);
        } else if (sales >= 10000) {
            System.out.println(" Commission " +  (sales * 5) / 100);
        } else {
            System.out.println(" Commission " +  (sales * 2) / 100);
        }
    }

    public static void main(String[] args) {
        SalaryAndCommission7 obj = new SalaryAndCommission7();
        obj.salesCommission();

    }

}
