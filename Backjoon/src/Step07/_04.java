package Step07;

import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 	//올라가
		int b = sc.nextInt();	//떨어져
		int v = sc.nextInt();	//높이
		int d = 1;
		int t = 0;
		
		while(true) {
			t += a * d;
			if(v <= t) {
				break;
			}
			t -= b*d;
			d++;
		}
		System.out.println(d);
	}
 }
