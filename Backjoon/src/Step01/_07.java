package Step01;
/*
 * 날짜 : 2022/08/19
 * 이름 : 장인화
 * 내용 : 1단계 7번 : A+B,A-B,A*B,A/B,A%B
 */
import java.util.Scanner;

public class _07 {
		public static void main(String[] args) {
			 
			Scanner sc = new Scanner(System.in);
				
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				
				System.out.println(num1 + num2 );
				System.out.println(num1 - num2 );
				System.out.println(num1 * num2 );
				System.out.println(num1 / num2 );
				System.out.println(num1 % num2 );
		}
}
