package Step03;

import java.util.Scanner;

public class _06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=1; i <=t; i++ ) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x = a + b;
			System.out.println("Case #" + i + ": " + x);
		}
		
	}
}
