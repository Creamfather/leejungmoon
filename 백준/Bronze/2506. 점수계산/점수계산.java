import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = 0;
		int sum = 0;
		int scr[] = new int[n];
		int scr1[] = new int[n];
		for (int i = 1; i <= n; i++) {
			int j = sc.nextInt();
			scr[s] = j; 
			s++;
		}
		if (scr[0] == 1) {
			scr1[0] = 1;
		} else if (scr[0] == 0) {
			scr1[0] = 0;
		}
				
		for ( int k = 1; k < n; k++) {
			if (scr[k] == 1) {
				scr1[k] = (scr1[k-1]+1);
			} else if(scr[k] == 0) {
				scr1[k] = 0;
			}
		}
		for (int h = 0; h < n; h++) {
			sum += scr1[h];
		}
		System.out.println(sum);

	}

}