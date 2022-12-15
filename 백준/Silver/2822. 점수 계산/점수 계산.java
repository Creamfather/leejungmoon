import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sco[] = new int [8];
		int sco1[] = new int [8];
		int nums[] = new int [5];
		
		int max = 0;
		int sum = 0;
		for (int i = 0; i < 8; i++) {
			int n = sc.nextInt();
			sco[i] = n;
			sco1[i] = sco[i];
		}
		
		Arrays.sort(sco);
		for (int i = 3; i < 8; i++) {
			nums[max] = sco[i];
			sum += sco[i]; 
			max++;
		}
		System.out.println(sum);
		for (int i = 0; i < 8; i++) {
			for (int k = 0; k < 5; k++) {
				if (sco1[i] == nums[k]) {
					System.out.print(i+1+ " ");
				}
			}
		}
			
	}	
		
}