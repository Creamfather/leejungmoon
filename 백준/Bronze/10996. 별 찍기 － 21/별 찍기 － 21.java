import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n*2; i++) {
			int a = n/2;
			if(n%2 !=0 ) {
				a = n/2 + 1;
			}
			if ( i%2 != 0 ) {
				for (int s = 1; s <= a; s++) {
					System.out.print("*" + " ");
				}
				a = 0;
			}
			if ( i%2 == 0 ) {
				for (int s = 1; s <= n/2; s++) {
					System.out.print(" " + "*");
				}
			}
			System.out.println();

		}

	}
}