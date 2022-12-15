import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int scr[] = new int[n];
		int scr1[] = new int[n];
		for (int i = 0; i < n; i++) {
			scr[i] = sc.nextInt();
			scr1[i]= sc.nextInt();			
		}
		for (int i = 0; i < n; i++) {
			int cnt = Math.abs(scr[i]);
			int cnt1 = Math.abs(scr1[i]);
			sum += cnt + cnt1;
		}
		System.out.println(sum);
	}

}