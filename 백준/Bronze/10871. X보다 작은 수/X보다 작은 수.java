import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long x = sc.nextLong();
		for (long i = 1; i <= n; i++) {
			int a = sc.nextInt(); 
			if (a < x) {
				System.out.print(a + " ");
				}
			}
	
	
	}
}