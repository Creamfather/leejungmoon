import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c = 1;
		int cc = 3;
		for (int i = 1; i <= n; i++) {
			for (int s = 1; s < i; s++) {
				System.out.print(" ");
			}
			for (int s = c; s <= n * 2 - 1; s++) {
				System.out.print("*");
			}
			c+=2;
			System.out.println();
		}
		for (int i = 1; i <= n - 1; i++) {
			for (int s = i; s <= n - 2; s++) {
				System.out.print(" ");
			}
			for (int s = 0; s < cc; s++) {
				System.out.print("*");
			}
			cc+=2;
			System.out.println();
		}
	}
}
