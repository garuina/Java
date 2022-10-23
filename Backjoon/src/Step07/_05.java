package Step07;

import java.util.Scanner;

public class _05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=1; i<=a ; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			
			int x; // 앞 호수 n/h
			int y; // 뒷 호수 n%h
			
			if(n<h) {
				y = 1;
			}else {
				if(n%h==0) {
					y = n/h;
				}else {
					y = n/h +1;
				}
			}
			
			if(n%h==0) {
				x = h;
			}else {
				x = n%h;
			}
			
			if(y<10) {
				System.out.print(x);
				System.out.print(0);
				System.out.print(y);
			}else {
				System.out.print(x);
				System.out.print(y);
			}
		}
	}
}
