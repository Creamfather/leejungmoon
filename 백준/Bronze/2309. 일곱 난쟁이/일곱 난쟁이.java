import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int sum = 0;
		int spy1 = 0;
		int spy2 = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			for (int a = i + 1; a < arr.length; a++) {
				if (sum - arr[i] - arr[a] == 100 ) {
					spy1 = i;
					spy2 = a;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == spy1 || i ==spy2)
				continue;
		
			System.out.println(arr[i]);
		}
		sc.close();
	}
}