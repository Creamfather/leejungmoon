import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// (r1+x)/2 = s
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
			
		for(int i = 1; i <= t; i++) {
			int v = sc.nextInt();
			int e = sc.nextInt();
			System.out.println((e-v)+2);
		}
		
		
		
	}

}