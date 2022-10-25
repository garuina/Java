package Step07;

import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		

		if(C <= B) {
			System.out.println("-1");
		}
		else {
			System.out.println( (A/(C-B))+1 );
		}

		int cnt = 0;
		
		while(true) {
			if ( (C *cnt)-(A + (B * cnt)) > 0) {
				break;
			}
			cnt++;
		}
		System.out.println(cnt);
		}

	}

