import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			String a = sc.next();
			if(k == 1) {
				for(int j = 0; j < a.length(); j++) {
					if(a.charAt(j) == 'd') {
						System.out.print("q");
					}else if(a.charAt(j) == 'b') {
						System.out.print("p");
					}else if(a.charAt(j) == 'q') {
						System.out.print("d");
					}else if(a.charAt(j) == 'p') {
						System.out.print("b");
					}
				}
				System.out.println();
			}else if(k == 2) {
				for(int j = 0; j < a.length(); j++) {
					if(a.charAt(j) == 'd') {
						System.out.print("b");
					}else if(a.charAt(j) == 'b') {
						System.out.print("d");
					}else if(a.charAt(j) == 'q') {
						System.out.print("p");
					}else if(a.charAt(j) == 'p') {
						System.out.print("q");
					}
				}
				System.out.println();
			}
		}
		sc.close();
	}
}