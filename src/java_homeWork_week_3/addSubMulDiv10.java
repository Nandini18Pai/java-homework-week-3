package java_homeWork_week_3;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class addSubMulDiv10 {
    int a,b;
    String sym;
    public void calculations() {

            Scanner sc= new Scanner(System.in);
            System.out.println("Enter First Number : ");
            a=sc.nextInt();
            System.out.println("Enter Second Number : ");
            b=sc.nextInt();
            System.out.println("Enter Arithmetic sign : ");
            sym=sc.next();
            sc.close();
        }
        public void functions()
        {
            if(sym.equals("+"))
            {
                System.out.println("Addition of two Numbers :"+(a+b));
            }
            else if (sym.equals("-"))
            {
                System.out.println("Subtraction of two Numbers :"+(a-b));
            }
            else if (sym.equals("*"))
            {
                System.out.println("Multiplication of two Numbers :"+(a*b));
            }
            else if (sym.equals("/"))
            {
                System.out.println("Division of two Numbers :"+(a/b));
            }
            else
            {
                System.out.println("Invalid Symbol");
            }

        }

        public static void main(String[] args)
        {
            addSubMulDiv10 obj = new addSubMulDiv10();

            obj.calculations();
            obj.functions();
        }
    }