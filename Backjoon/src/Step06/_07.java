package Step06;

import java.util.Scanner;

public class _07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int a = A /100;
		int b = A/10 - (A/100)*10; 
		int c = A % 10;
		
		int d = B/100;
		int e = B/10 - (B/100)*10;
		int f = B % 10;
		
		int D = c*100 + b*10 + a;
		int E = f*100 + e*10 + d;
		
		System.out.println(Math.max(D, E));
	}
}
