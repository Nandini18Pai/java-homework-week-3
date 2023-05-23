package java_homeWork_week_3;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following
 */
public class GrossSalary5 {
    public void read() {
        double hra;
        double ta;
        double da;
        double pf;
        double grosssalary;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the employed ID");
        int empid = scanner.nextInt();
        System.out.println(" Enter employee name ");
        String empname = scanner.next();
        System.out.println("Enter the basic salary ");
        double basicsalary = scanner.nextDouble();
        hra = (basicsalary * 10 / 100);
        ta = (basicsalary * 8 / 100);
        da = (basicsalary * 9 / 100);
        pf = (basicsalary * 20 / 100);
        grosssalary = (basicsalary + hra + ta + da - pf);
        scanner.close();

        System.out.println("_________________________________________");
        System.out.println("|             Salary Slip               |");
        System.out.println("|_______________________________________|");
        System.out.println("|Employee Id          :" + empid + "               |");
        System.out.println("|Employee Name        :" + empname + "            |");
        System.out.println("|_______________________________________|");
        System.out.println("| Basic Salary        :" + basicsalary + "          |");
        System.out.println("| HRA 10%             :" + hra + "           | ");
        System.out.println("| TA 8%               :" + ta + "           | ");
        System.out.println("| DA 9%               :" + da + "           | ");
        System.out.println("| PF-20&              :" + pf + "           | ");
        System.out.println("| ______________________________________| ");
        System.out.println("| Gross Salary        :" + grosssalary + "          | ");
        System.out.println("|=======================================|");

    }

    public static void main(String[] args) {
        GrossSalary5 obj = new GrossSalary5();
        obj.read();


    }


}
