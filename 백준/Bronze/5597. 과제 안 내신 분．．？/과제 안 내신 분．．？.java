import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int[] arr = new int[31];
		for (int a = 1; a <= 28; a++) {
			int n = sc.nextInt();
			arr[n] = 1;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != 1) {
				System.out.println(i);
			}
		}

	}

}