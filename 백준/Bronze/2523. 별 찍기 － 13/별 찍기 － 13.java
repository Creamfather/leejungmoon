import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		for(int i = 1; i <= n; i++) {
			for (int s = 1; s <= i; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i <= n - 1; i++) {
			for (int s = i; s <= n-1; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}

}