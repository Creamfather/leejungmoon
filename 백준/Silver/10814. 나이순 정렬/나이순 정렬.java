import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		 
		// 입력되는 나이의 범위 : 1 ~ 200
		StringBuilder[] p = new StringBuilder[201];
		
		//객체배열의 인덱스에 각 StringBuilder 객체를 생성해준다.
		for(int i = 0; i < p.length; i++) {
			p[i] = new StringBuilder();
		}
		
		for(int i = 0; i < N; i++) {
			int age = in.nextInt();
			String name = in.next();
			// 카운팅 정렬 : 나이를 index 로 하여 해당 배열에 나이와 이름을 append() 한다
			p[age].append(age).append(' ').append(name).append('\n');
		}
		
		StringBuilder sb = new StringBuilder();
		for(StringBuilder val : p) {
			sb.append(val);
		}
        
		System.out.println(sb);
	}
}
