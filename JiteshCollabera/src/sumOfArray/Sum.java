package sumOfArray;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of Array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements in array");
        int sum=0;
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println("Sum is "+sum);
    }
}
