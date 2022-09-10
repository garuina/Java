package Ch11;

public class P370 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);
		// 문자열 abc는 상수 풀에 저장되어 있으므로 가리키는 주소값이 같음
		
		System.out.println(str3.equals(str4));
		
		
		
	}
}
