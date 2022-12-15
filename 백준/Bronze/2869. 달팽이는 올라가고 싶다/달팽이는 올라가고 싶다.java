import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int move = up - down; //실질적인 하루 이동 거리(올라간 거리 - 내려간 거리)
		int safe_m = m - up; //up+down이 무조건 일어나는 날들의 마지노선을 구해줄 때 사용
		if(safe_m == 0) {
			System.out.println(1);
			return;
		}
		int day = safe_m / move;
		 if (day * move + up >= m) {
			System.out.println(day + 1);
		} else{
			System.out.println(day + 2);
		}
			
		
	}
}