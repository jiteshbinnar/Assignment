package weeklyExam;

public class Que7 {

	public static void main(String[] args) {
		int fact=1;
        int limit=5;
		for (int i = 1; i <= limit; i++) {
		fact=fact*i;
		}
		System.out.println("factorial of number "+limit+" is " +fact);
	}

}
