package weeklyExam;

import java.util.Arrays;

public class LogicByAstroid {

	public static void main(String[] args) {
		int a[]= {12,454,77,433,1000,3,23,500,800,773,2000,9};
		boolean j=true;
	
		for (int i = 0; i < a.length-1; i++) 
		{
				if(a[i]>a[i+1]) 
				{
					a[i]=a[i]+a[i+1];
					a[i+1]=a[i]-a[i+1];
					a[i]=a[i]-a[i+1];
					j=false;
				}
				if(!j)
				{
					i=-1;
					j=true;
				}
			
			
		}
		
		
	System.out.println(Arrays.toString(a));
	}

}
