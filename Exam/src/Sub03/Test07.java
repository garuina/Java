package Sub03;
/*
 * 날짜 : 2022-09-02
 * 이름 : 장인화
 * 내용 : 자바 클래스 연습문제
 */
class Customer {
	protected int id;
	protected String name;
	protected String grade;
	protected int point;
	protected double pointRatio;
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		this.grade = "SILVER";
		this.point = 100;
		this.pointRatio = 0.01;
	}

	
	public int calcPrice(int price) {
		point += price * pointRatio;
		return price;
	}
	public void showInfo() {
		System.out.println("=====================");
		System.out.println("고객번호 : "+ id);
		System.out.println("고객이름 : "+name);
		System.out.println("고객등급 : "+ grade);
		System.out.println("현재 포인트 : "+ point);
		System.out.println("포인트 적립율 : "+ pointRatio);
		System.out.println("---------------------");
	}
}


class VipCustomer extends Customer{
	private  double saleRatio;
	
	public VipCustomer(int id, String name) {
		super(id, name);
		super.grade = "VIP";
		super.point = 1000;
		super.pointRatio = 0.05;
		this.saleRatio = 0.1;
		
	}
	
	public int calcprice(int price) {
		point += pointRatio;
	}
	
	
	
}
	
	

public class Test07 {

}
