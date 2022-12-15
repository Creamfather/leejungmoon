import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//배(0)와 등(1)
		//첫째 줄부터 셋째 줄까지 각 줄에 각각 한 번 던진 윷짝들의 상태를 나타내는 네 개의 정수(0 또는 1)가 빈칸을 사이에 두고 주어진다
		//첫째 줄부터 셋째 줄까지 한 줄에 하나씩 결과를 도는 A, 개는 B, 걸은 C, 윷은 D, 모는 E로 출력한다.
		
		
		Scanner sc = new Scanner(System.in);		
		int[] s = new int[3];
				
		for (int i = 0; i < 3; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			s[i] = a + b + c + d;
		}
		for (int i = 0; i < 3; i++) {
			if (s[i] == 0) {
				System.out.println("D");
			} else if (s[i] == 1) {
				System.out.println("C");
			} else if (s[i] == 2) {
				System.out.println("B");
			} else if (s[i] == 3) {
				System.out.println("A");
			} else if (s[i] == 4) {
				System.out.println("E");
			}
		}
		
	}

}