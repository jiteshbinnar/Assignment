package weeklyExam;

public class Que1 {

	public static void main(String[] args) {
		int a[]= {11,34,66,3,6,67,7,1};
		for (int i = 0; i < a.length-1; i++)
		{
			for (int j = 0; j < a.length-1; j++) 
			{
			   if(a[j]>a[j+1])
			   {
				   int temp=a[j];
				    a[j]=a[j+1];
				  a[j+1]=temp;
			}
		}
	}
		for (int i = 0; i < a.length; i++) 
		{
		System.out.print(a[i]+" ");	
		}
	}
}
