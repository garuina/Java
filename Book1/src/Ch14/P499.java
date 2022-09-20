package Ch14;

public class P499 {
public static void main(String[] args) {
	try (AutoCloseObj obj = new AutoCloseObj()){
		throw new Exception(); // 강제예외 발생
	} catch (Exception e) {
		System.out.println("예외 부분입니다.");
	}
}
}
