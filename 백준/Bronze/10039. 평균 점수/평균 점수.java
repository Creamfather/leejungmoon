import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
			for (int i = 1; i <=5; i++) {
				int avr = sc.nextInt();
				if (avr >= 40) {
					sum += avr;
				}
				else sum += 40;
			}
			System.out.println(sum/5);

	}
}