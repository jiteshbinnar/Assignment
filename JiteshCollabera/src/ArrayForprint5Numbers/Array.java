package ArrayForprint5Numbers;

public class Array {
    public static void main(String[] args) {
        int sum=0;
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(args[i]);
            sum=sum+a[i];
        }
        System.out.println("The sum is "+sum);
    }

}
