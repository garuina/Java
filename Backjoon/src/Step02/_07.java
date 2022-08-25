package Step02;

import java.util.Scanner;

public class _07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	
		
		if(a == b ) {
			if (a == c) {
				int cost = 10000 + 1000 * a;
				System.out.println(cost);
			}else if(a != c) {
				int cost = 1000 + 100 * a;
				System.out.println(cost);
			}
		
		}else if (b == c) {
			if( a == c) {
				int cost = 10000 + 1000 * a;
				System.out.println(cost);
			}else if (a != c) {
				int cost = 1000 + 100 * b;
				System.out.println(cost);	
			}
		} else if (a==c) {
			if (a==b) {
				int cost = 10000 + 1000 * a;
				System.out.println(cost);
			}else if (a !=b) {
				int cost = 1000 + 100 * c;
				System.out.println(cost);
			}
		
		}else {
			int max = Math.max(Math.max(a,b),c);
			System.out.println(max * 100);
		}
	}
}
