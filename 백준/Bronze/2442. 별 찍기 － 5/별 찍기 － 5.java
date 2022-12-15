import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		int a = n-1;
		for(int Line = 1; Line <= n; Line++) {
			for (int i = 1; i <= a; i++) {
				System.out.print(" ");
			}
			for (int s = m; s <= n; s++) {
				System.out.print("*");
			}
			a--;
			m -= 2;
			System.out.println("");
		}
	}

}