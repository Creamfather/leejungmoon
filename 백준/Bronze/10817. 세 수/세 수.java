import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1 1 3
		// 3 3 1
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (b>=a && b<=c) {
		System.out.println(b);
			}else if(a>=b && a<=c) {
				System.out.println(a);
			}else if(a<=b && a>=c) {
				System.out.println(a);
			}else if(c>=a && c<=b) {
				System.out.println(c);
			}else if(c<=a && c>=b) {
				System.out.println(c);
			}else if (b<=a && b>=c) {
				System.out.println(b);
			}System.out.println("");
		
		
	}
}
