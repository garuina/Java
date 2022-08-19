package Step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/20
 * 이름 : 장인화
 * 내용 : 1단계 12번 : 곱셈
 */
public class _12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();int b = sc.nextInt();int c = sc.nextInt();
		int d = sc.nextInt();int e = sc.nextInt();int f = sc.nextInt();
	
		System.out.println( (a*100 + b*10 + c) * f );
		System.out.println( (a*100 + b*10 + c) * e );
		System.out.println( (a*100 + b*10 + c) * d );
		System.out.println( (a*100 + b*10 + c) * (d*100 + e*10 + f) );
		
	
	}

}
