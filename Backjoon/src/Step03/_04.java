package Step03;

import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		
		for(int i = 1; i<=n ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int tot = a * b;
		
			System.out.println(tot);
		}
		
		
	}
}
