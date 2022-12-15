import java.util.Scanner;

public class Main {

	//입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 출석번호에 중복은 없다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		
		int n = sc.nextInt();
		int num = 0;
		for (int a = 1; a <= n; a++) {
			for (int i = 0; i < n - num; i++) {
				System.out.print("*");
			}
			num++;
			System.out.println("");
		}
		
		
		
		
		
		
		
	}

}