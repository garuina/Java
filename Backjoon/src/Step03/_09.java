package Step03;

import java.util.Scanner;

public class _09 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	for(int i=1; i<=n; i++) {
		for(int a=1; a<=n-i; a++) {
			System.out.print(" ");
		}for(int b=1; b<=i; b++){
			System.out.print("*");
			
		}System.out.print("\n");
	}
}
}
