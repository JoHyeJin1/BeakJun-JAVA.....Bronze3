import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int max = a[0];
		int min = a[0];
		for(int i = 0; i < n; i++) {
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		}
		
		System.out.print(min + " " + max);
		sc.close();
	}
}