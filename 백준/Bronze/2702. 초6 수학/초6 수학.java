import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int d = gcd(a, b);
			int c = (a * b) / d;
			System.out.println(c + " " + d);
		}
	}
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
			
		return gcd(b, a%b);
	}
		
		
	
}