import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		for(int i = 0; i < 5; i++) {
			int a = sc.nextInt();
			count += a;
		}
		System.out.println(count);
		
		sc.close();
	}
}
