package java_homeWork_week_3;

import java.util.Scanner;

public class AvgValueOfArray19 {
int no;
int sum =0;
public  void average(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of Array  ");
    no =sc.nextInt();
    int a[]=new int[no];
    for(int i=0; i<no;i++)
    {
        System.out.println("a["+i+"] : ");
        a[i]=sc.nextInt();
        sum=sum+a[i];
    }
    int avg1=sum/a.length;
    System.out.println("Average of Array : "+avg1);
}

    public static void main(String[] args)
    {
        AvgValueOfArray19 obj = new AvgValueOfArray19();
        obj.average();
    }


}
