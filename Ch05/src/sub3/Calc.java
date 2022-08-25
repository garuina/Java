package sub3;

public class Calc {
//재활용성이 떨어지는 클래스는 싱글톤으로.. 오직 하나의 객체로만 만들어버림
//힙은 무수히 많은 인스턴스 클래스는 오직하나의 인스턴스
	
	private static Calc instance = new Calc();
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}
	
	
	//private으로 하면 메인의 new Calc가 막힘 
	//그럼 어떻게 하냐.. Calc.getinstance를이용
	
	public int plus(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y;
	}
	public int multi(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) {
		return x / y;
	}
}
