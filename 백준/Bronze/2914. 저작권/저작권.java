import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		
		//8/4=2
		// a/b=c
		// a = b * c.01
		
		
		Scanner sc = new Scanner(System.in);		
		double s = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		s = b - 1  + 0.01;
		
		System.out.println((int) Math.ceil(s * a));
		
	}

}