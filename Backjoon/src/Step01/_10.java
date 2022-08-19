package Step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 장인화
 * 내용 : 1단계 10번: 킹, 퀸, 룩, 비숍, 나이트, 폰 1 1 2 2 2 8
 */
public class _10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt(); 
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		int num6 = sc.nextInt();
		
		System.out.println( 1 - num1 );
		System.out.println( 1 - num2 );
		System.out.println( 2 - num3 );
		System.out.println( 2 - num4 );
		System.out.println( 2 - num5 );
		System.out.println( 8 - num6 );
		
	}
}
