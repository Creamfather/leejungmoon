import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int g = sc.nextInt();
		int h = sc.nextInt();
		int i = sc.nextInt();

		System.out.println(Math.max(a, Math.max(b, Math.max(c, Math.max(d, Math.max(e, Math.max(f, Math.max(g, Math.max(h, i)))))))));
		int n = (Math.max(a, Math.max(b, Math.max(c, Math.max(d, Math.max(e, Math.max(f, Math.max(g, Math.max(h, i)))))))));
		int[] ch = new int[] { a, b, c, d, e, f, g, h, i };

		for (int z = 0; z <= 8; z++) {
			if (n == ch[z]) {
				System.out.println(z + 1);
			}

		}
	}
}