import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.

		int cnt = 0;
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			if (a > 0) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}