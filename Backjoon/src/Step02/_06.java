package Step02;

import java.util.Scanner;

public class _06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(C < 60) {
			if(B + C < 60) {
				System.out.print(A + 1 + " " );
				System.out.print(B + C );
			}else if (B + C > 60) {
				
			}
			
			
		}
		
		
	}
}
