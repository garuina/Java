package Step02;

import java.util.Scanner;

public class _06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (b+c > 60) {
			a =  a+ (b+c)/60;
			b = (b+c) - (((b+c)/60)* 60);
			if (a == 24) {
				System.out.println(0 + " " + b);
			}else {
				System.out.println(a + " " + b);
			}
		}else {
			b= b + c;
			System.out.println(a + " " + b);
		}
		
		
		
	}
}
