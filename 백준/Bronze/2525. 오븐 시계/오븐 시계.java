import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int h;
		if (a >= 0 && a <= 23 && b >= 0 && b <= 59 && c >= 0 && c <= 1000) {
			h = a * 60 + b + c ;
			a = h/60;
			b = h%60;
		}
		if (a >= 24) {
			  a = a - 24;
		}
			System.out.print(a + " ");
			System.out.print(b + " ");

	}
}