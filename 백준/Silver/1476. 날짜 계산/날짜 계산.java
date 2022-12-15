import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		 (1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19)
		int e=1,s=1,m=1;
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		
		for (int year = 1; ; year++) {
			if (e==E && s==S && m==M) {
				System.out.println(year);
				break;
			}
			e++;
			s++;
			m++;
			if(e == 16) {
				e = 1;
			}
			if(s == 29) {
				s = 1;
			}
			if(m == 20) {
				m = 1;
			}
		}
		
    }
}