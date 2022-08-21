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
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println( a *(b - (b/10)*10 )); 
		System.out.println( a * ( b/10 - b/100*10) );
		System.out.println( a *( b /100));
		System.out.println( a *b );
		
	}
}
