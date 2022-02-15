package weeklyExam;

public class Que8 {

	public static void main(String[] args) 
	{
	int a[]= {123,247,368};
	int max=Integer.MIN_VALUE;
	for (int i = 0; i < a.length; i++) 
	{
	if(a[i]>max)
		max=a[i];
	}
	System.out.println("max number is "+max);
	
    int min=Integer.MAX_VALUE;
    for (int i = 0; i < a.length; i++)
    {
		if(a[i]<min)
			min=a[i];
	}
    System.out.println("min number is "+min);
	}

}
