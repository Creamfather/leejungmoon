import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[20];
		int sum = 0;
		int a = 0;
		int b = 0;
		for (int i = 0; i < 20; i++) {
			arr[i] = i+1;
		}
		for (int n = 0; n < 10; n++) {
			a = sc.nextInt();
			b = sc.nextInt();
			int c = a-1;
			int[] arr1 = new int[b-a+1];
			for (int i = 0; i < b-a+1; i++) {
				arr1[i] = arr[c];
				c++;
			}
			c = a-1;
			for (int i = arr1.length-1; i >= 0; i--) {
				arr[c]= arr1[i];
				c++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
}