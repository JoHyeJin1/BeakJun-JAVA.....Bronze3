import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int[] book = new int[9];
		
		int bookT = 0;
		for(int i = 0; i < book.length; i++) {
			book[i] = sc.nextInt();
			bookT += book[i];
		}
		
		System.out.println(total - bookT);
		sc.close();
	}
}