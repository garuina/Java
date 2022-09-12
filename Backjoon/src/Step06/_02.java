package Step06;

import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String a = sc.next();
		int t = 0;
		
		
		for(int i=0; i<n; i++) {
			t += a.charAt(i)-48;
		}
		
		System.out.println(t);
		
	}
}
