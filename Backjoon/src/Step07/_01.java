package Step07;

import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int cnt = 0;
		
		while(true) {
			if ( A + B * cnt < C * cnt) {
				break;
			}
			cnt++;
		}
		if(B * cnt >2100000000 || C * cnt >2100000000) {
			System.out.println(-1);
		}else {
			System.out.println(cnt);
		}
	}
}
