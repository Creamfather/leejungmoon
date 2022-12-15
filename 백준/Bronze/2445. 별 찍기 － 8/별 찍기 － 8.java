import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = n;
		int a = n-1;
		int b = 3;
		int S = 2;
		int star = 1;
		for(int Line = 1; Line <= n; Line++) {
			for (int s = 1; s <= Line; s++) {
				System.out.print("*");
			}
			for (int l = b; l <= n * 2; l++) {
				System.out.print(" ");
			}
			for (int s = 1; s <= Line; s++) {
				System.out.print("*");
			}
			b+=2;
			System.out.println();
		}
		for(int Line = 1; Line <= n-1; Line++) {
			for (int s = Line; s <= n-1; s++) {
				System.out.print("*");
			}
			for (int l = 1; l <= S; l++) {
				System.out.print(" ");
			}
			for (int s = Line; s <= n-1; s++) {
				System.out.print("*");
			}
			S+=2;
			System.out.println();
		}
		
		
	}

}