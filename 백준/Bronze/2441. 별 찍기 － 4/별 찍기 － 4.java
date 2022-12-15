import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int num = 0;
		for (int a = 1; a <= n; a++) {
			for (int s = 0; s < num; s++) {
				System.out.print(" ");
			}
			for (int i = 0; i < n - num; i++) {
				System.out.print("*");
			}
			num++;
			System.out.println("");
		}

	}

}