package GreatestAndSmallestNumber;

public class Number {

    public static void main(String[] args) {
        int a[]={5,78,1,6,74,9,6,4,6,7};
        int great=a[0];int small=a[0];
        for (int i=0;i<a.length;i++)
        {
            if(a[i]>great)
              great=a[i];
            else if(a[i]<small)
             small=a[i];
        }
        System.out.println("Greatest Number is "+great);
        System.out.println("Smallest Number is "+small);
    }
}
