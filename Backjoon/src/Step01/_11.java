package Step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 장인화
 * 내용 : 1단계 11번: 나머지
 */
public class _11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println( (A + B) % C );
		System.out.println( ((A % C) + (B % C)) % C);
		System.out.println( (A * B) % C);
		System.out.println( ((A % C) * (B % C)) % C );
	}
}
