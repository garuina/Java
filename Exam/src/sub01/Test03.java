package sub01;
/*
 * 날짜 : 2020/08/19 
 * 이름 : 장인화
 * 내용 : 자바 자료형 연습문제
 */
public class Test03 {
	public static void main(String[] args) {
		
		int num = 1;
		int result = 0;
				
		result = num++;
		System.out.println("result : "+ result);
		
		result = ++num;
		System.out.println("result : "+ result);
				
		result = num--;
		System.out.println("result : "+ result);
				
		result = --num;
		System.out.println("result : "+ result);
	}
}
