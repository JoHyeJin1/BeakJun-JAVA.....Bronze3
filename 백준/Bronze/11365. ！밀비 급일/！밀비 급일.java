import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		while(a.equals("END") == false) {
			String b = "";
			for(int i = a.length() - 1; i >= 0; i--) {
				b += a.charAt(i);
			}
			System.out.println(b);
			a = sc.nextLine();
		}
		sc.close();
	}
}
