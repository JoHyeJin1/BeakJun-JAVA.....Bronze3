import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			System.out.println("Hello World, Judge " + (i + 1) + "!");
		}
		sc.close();
	}
}
