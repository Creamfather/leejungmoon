import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		StringBuilder sb = new StringBuilder();
		char[] ch = new char[n.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = n.charAt(i);
		}
		
		Arrays.sort(ch);
		sb.append(ch);
		sb.reverse();
		System.out.println(sb);
	}
}