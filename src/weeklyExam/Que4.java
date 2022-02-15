package weeklyExam;

import java.util.Iterator;

public class Que4 {

	public static void main(String[] args)
	{
	int a[]= {12,5,45,24,78,45,3,9};
	for (int i = 0; i < a.length; i++)
	{
	 for (int j = i+1; j < a.length; j++) {
		if(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		
	}
		
	}
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}

	}

}
