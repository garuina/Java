package sub02;
/*날짜 : 2022/08/26
* 이름 : 장인화
* 내용 : 자바 배열 문자 출력 연습문제
*/
public class Test10 {
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println(fibo(i) + " ");
		}
	}
		public static int fibo(int n) {
			if(n <= 1) {
				return n;
			}
			
			return fibo(n-2) + fibo(n-1);
		}
	}
	

