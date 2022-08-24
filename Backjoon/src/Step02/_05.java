package Step02;

import java.util.Scanner;

public class _05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if( H>0 && M>=45 ) {
			System.out.print(H + " ");
			System.out.print(45-M );
		
		}else if(H>0 && M<45) {
			System.out.print(H-1 + " ");
			System.out.print(60-(45-M) );
		
		}else if(H==0 && M>=45) {
			System.out.print(0 + " ");
			System.out.print(45-M);
			
				
		}else {
			System.out.print(23 + " ");
			System.out.print(60-(45-M));
		}
		
		
		
	}
}
