package weeklyExam;




public class Que5 {

	public static void main(String[] args) {
		int a[][]= {{6,3,1},
				    {9,7,8},
				    {2,4,5}};
		boolean flag=true;
	    for (int i = 0; i < a.length; i++) 
	    	
	    {
			for (int j = 0; j < a.length; j++) 
			{
				int element =a[i][j];
				int row=i;
				int col=j;
				int smallestElementInRow=0;
				for (int k = 0; k < a.length; k++) 
				{
					for (int k2 = 0; k2 < a.length; k2++)
					{
						if(k==row)
						{
							if(a[k][k2]<element)
								smallestElementInRow++;
						}
					}
				}
				int greatInCol=0;
				for (int k = 0; k < a.length; k++) 
				{
					for (int k2 = 0; k2 < a.length; k2++) 
					{
						if(k2==col)
						{
							if(a[k][k2]>element)
								greatInCol++;
						}
					}
				}
				if(smallestElementInRow==0 && greatInCol==0)
				{
					System.out.println("saddle point fount at "+a[i][j]);
				  flag=false;
				}
		}
	
	}
	    if(flag)
	    	System.out.println("saddle point not found");

}
}