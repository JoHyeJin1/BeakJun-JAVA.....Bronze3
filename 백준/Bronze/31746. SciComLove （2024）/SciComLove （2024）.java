import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("SciComLove");
		}else {
			System.out.println("evoLmoCicS");
		}
		
		sc.close();
	}
}