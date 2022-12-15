import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//      기차는 역 번호 순서대로 운행한다.
//		출발역에서 내린 사람 수와 종착역에서 탄 사람 수는 0이다.
//		각 역에서 현재 기차에 있는 사람보다 더 많은 사람이 내리는 경우는 없다.
//		기차의 정원은 최대 10,000명이고, 정원을 초과하여 타는 경우는 없다.
//		4개의 역에 대해 기차에서 내린 사람 수와 탄 사람 수가 주어졌을 때, 기차에 사람이 가장 많을 때의 사람 수를 계산하는 프로그램을 작성하시오.
//		각 역에서 내린 사람 수와 탄 사람 수가 빈칸을 사이에 두고 첫째 줄부터 넷째 줄까지 역 순서대로 한 줄에 하나씩 주어진다. 
//		첫째 줄에 최대 사람 수를 출력한다.
		
		int now = 0 ; 
		int max = 0 ;
		for (int i = 1; i <= 4; i++) {
			int out = sc.nextInt(), in = sc.nextInt();	
			now = now - out + in;
			if (now > max) {
				max = now;
			}
		}
		System.out.println(max);

	}
}