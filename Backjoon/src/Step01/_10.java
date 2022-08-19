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
		
		if(num1 < 1) {
			System.out.print(num1 + ( 1 - num1) );
		}
		else {
			System.out.print(num1 - (num1-1));
		}

		
	}
}
