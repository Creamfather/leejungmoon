import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();
		int num = 1;
		int starCnt = 1;
		for (int line = 1; line <= cnt; line++) {
			for (int i = num; i <= cnt-1; i++) {
				System.out.print(" ");
			}
			num++;
			for (int star = 1; star <= starCnt; star++) {
				System.out.print("*");
			}
			starCnt++;
			System.out.println("");
			
		}
		
	}
}