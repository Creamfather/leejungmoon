import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int num = 1;
		int a = n+1;
		int b = n;
		for (int Line = 1; Line <= n; Line++) {
			for (int s = num ; s < n; s++) {
				System.out.print(" ");
			}
			for (int s = 1; s <= 1; s++) {
				System.out.print("*");
			}
			for (int s = a; s < n; s++) {
				System.out.print(" ");
			}
			if (b < n) {
				System.out.print("*");
			}
			b--;
			a-=2;
			num++;
			System.out.println();
		}
	
	
	
	
	}
}