package Step05;

import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 123 n/100, ((n%100)-(n%10))/10, n%10 
		
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i=1; i<=n; i++) {
			if(i>=100 && i<1000) {
				int a = i/100;
				int b = ((i%100)-(i%10))/10;
				int c = i%10;
				if(b-a == c-b) {
					cnt++;
				}
			}else if(i<100 ) {
				cnt++;
			}
		}System.out.println(cnt);
	}
}
