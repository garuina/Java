package Step03;

import java.util.Scanner;

public class _08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i <=n; i++) {
			for(int a=1 ; a<=i; a++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
