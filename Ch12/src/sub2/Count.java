package sub2;

public class Count {
	
	private int num;
	
	public int getNum() {
		return num;
	}
	
	// 동기화블럭 : 스레드간 결합을 막고 동기방식으로 실행 , 
	// 하나이상의 스레드가 동시에 진입을 못하도록..
	public synchronized void setNum() {
		num++;
	}
	
}
