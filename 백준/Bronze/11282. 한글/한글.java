import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		n = n + 44031;
		System.out.println((char)n);
		sc.close();
	}
}