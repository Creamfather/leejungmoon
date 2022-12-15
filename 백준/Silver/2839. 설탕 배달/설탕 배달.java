import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int n = sc.nextInt();
		int a = n/5;
		int b = n%5;
		int c = b-3;
		if (n == 4 || n == 7) {
			System.out.println(-1);
		} else if (n % 5 == 2 || n % 5 == 4) {
			System.out.println(a+2);
		} else if (n % 5 == 1 || n % 5 == 3) {
			System.out.println(a+1);
		} else if (b == 0){
			System.out.println(a);
		} 
		
		
		
		
	}
}