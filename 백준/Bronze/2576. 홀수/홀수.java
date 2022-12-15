import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		int sum = 0;
		int[] arr1 = new int[7];
		;
		for (int i = 0; i < 7; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		for (int i = 0; i < 7; i++) {
			if (arr[i] % 2 != 0) {
				sum += arr[i];
				arr1[i] = arr[i];
			}
		}
		if (arr[1] % 2 == 0 && arr[1] % 2 == 0 && arr[2] % 2 == 0 && arr[3] % 2 == 0 && arr[4] % 2 == 0
				&& arr[5] % 2 == 0 && arr[6] % 2 == 0 && arr[0] % 2 == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
		}Arrays.sort(arr1);
		for (int i = 0; i < 7; i++) {
			if (arr1[i] > 0) {
				System.out.println(arr1[i]);
				break;
			}
		}

	}
}