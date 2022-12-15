import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int n = sc.nextInt();
		int m = n;
		int a = n-1;
		int c = 0;
		int S = 1;
		for(int Line = 1; Line <= n; Line++) {
			for (int i = 1; i <= a; i++) {
				System.out.print(" ");
			}
			for (int s = m; s <= n; s++) {
				System.out.print("*");
			}
			a--;
			m -= 2;
			c++;
			System.out.println("");
		}
		if (c == n) {
			for(int Line = 1; Line <= n; Line++) {
				System.out.print(" ");
				for (int s = S; s <= n + n -3; s++) {
					System.out.print("*");
				}
				if (S == n + n - 1) {
					break;
				}
				System.out.println();
				for (int s = 1; s <= Line; s++) {
					System.out.print(" ");
				}
				S+=2;
				
			}
			
		}
		
	}

}