import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// n + n - 1 의 별의 갯수를 넣고
		int n = sc.nextInt();
		int S = 1;
		for(int Line = 1; Line <= n; Line++) {
			for (int s = S; s <= n + n -1; s++) {
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