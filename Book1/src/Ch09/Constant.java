package Ch09;

public class Constant {

	int num = 10;
	final int Num = 100;
	
	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 50;
		// cons.Num = 200; final 인데 상수를 대입해서 오류 뜸 
		
		System.out.println(cons.num);
		System.out.println(cons.Num);
		
	}
}
