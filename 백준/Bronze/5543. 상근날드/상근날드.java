import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		if (a >= 100 && a <= 2000 && b >= 100 && b <= 2000 && c >= 100 && c <= 2000 && d >= 100 && d <= 2000 && e >= 100 && e <= 2000) {
			System.out.println(Math.min(a, Math.min(b, c)) + Math.min(d, e) - 50);
		}


	}
}