package Ch13;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		int unNum =100;
		//static int sInNum = 200;
	
	void inTest() {
		System.out.println("OutClss num = " + num + "(외부 클래스의 인스턴스 변수)");
		System.out.println("OutClss snum = " + sNum + "(외부 클래스의 인스턴스 변수)");
	}
	public void usingClass() {
		inClass.inTest();
	}
	}
	
	
	
	
}



public class P450 {

}
