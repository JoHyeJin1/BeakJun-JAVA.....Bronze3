import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		for(int i = 0; i < s.length(); i++) {
			System.out.print((char)(s.charAt(i) - 32));
		}
		sc.close();
	}
}
