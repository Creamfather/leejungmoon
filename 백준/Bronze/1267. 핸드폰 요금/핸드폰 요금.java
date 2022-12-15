import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = 0;
		int m = 0;
		int a = 0;
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			int t = sc.nextInt();
			a = t;
			while (t >= 0) {
				t -= 30;
				y++;
			}
			while (a >= 0) {
				a -= 60;
				m++;
			}
		}
		y = y * 10;
		m = m * 15;
		if (y > m) {
			System.out.println("M " + m);
		}
		if (m > y) {
			System.out.println("Y " + y);
		}
		if (m == y) {
			System.out.println("Y M " + y);
		}
	}
	
}
