package sub02;
/*
 * 날짜 : 2022/08/26
 * 이름 : 장인화
 * 내용 : 자바 배열 문자 출력 연습문제
 */
public class Test08 {
	public static void main(String[] args) {
		
		System.out.println("3! = " + factorial(3));
		System.out.println("4! = " + factorial(4));
		System.out.println("5! = " + factorial(5));
	}
	public static int factorial(int n) {
		if(n <= 1) {
			return 1;
		}
		
		return n * factorial (n-1);
	}
	
	
}
