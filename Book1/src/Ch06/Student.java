package Ch06;

public class Student {
	
	//속성(변수)
	public String studentName;
	public int grade;
	public int money;
	
	
	// 생성자
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	//메서드 (기능)
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeSubway (Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다.");
	}
	
}
