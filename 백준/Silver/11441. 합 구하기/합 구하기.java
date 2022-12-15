import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		int[] arr = new int[a];
		int[] arr1 = new int[a+1];
		arr1[0] = 0;
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
			arr1[i+1] = arr1[i] + arr[i];
		}
		int b= sc.nextInt();;
		for (int i = 1; i <= b; i++) {
			int c= sc.nextInt();;
			int d= sc.nextInt();;
			sb.append(arr1[d] - arr1[c-1]).append("\n");	
		}
		System.out.println(sb);
		
	}

}