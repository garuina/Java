package sub08;
/*
 * 날짜 : 2022/09/29
 * 이름 : 장인화
 * 내용 : 자바 총정리 연습문제
 */

@FunctionalInterface
interface MyLambda<T>{
	public T what(T t);
}

public class Test_06 {
	public static void main(String[] args) {
		
		MyLambda <Integer> factorial = (n) -> {
			int result = 1;
			
			for(int i=1; i <=n; i++) {
				result *= i;
			}
			
			return result;
		};
		
		MyLambda <String> reverse = (s) -> {
			
		String result = "";
		
		for(int i = s.length()) {
			
		}
		}
	}
}
