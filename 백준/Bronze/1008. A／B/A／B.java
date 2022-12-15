import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble(), b = sc.nextDouble();
		if (a > 0 && a < 10 && b > 0 && b < 10)
		System.out.print(a/b);

	}
}