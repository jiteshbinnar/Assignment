package weeklyExam;

public class Que3 {

	public static void main(String[] args) {
	int a[]= {1,2,3,4,4,4,5,6,4,4};
	int num=4;
	int count=0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]==num)
			count++;
	}
	int b[]=new int [a.length-count];
	int index=0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]!=num)
			b[index++]=a[i];
	}
	for (int i = 0; i < index; i++) {
		System.out.println(b[i]);
	}

	}

}
