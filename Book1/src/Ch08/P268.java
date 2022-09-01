package Ch08;
import java.util.ArrayList;

public class P268 {
	public static void main(String[] args) {
		
	ArrayList<Customer> customerlist = new ArrayList<Customer>();
	
	Customer customerLee = new Customer(10010, "이순신");
	Customer customerShin = new Customer(10020, "신사임당");
	Customer customerHong = new Goldcustomer(10010, "홍길동");
	Customer customerYoul = new Goldcustomer(10010, "이율곡");
	Customer customerKim = new VIPcustomer(10010, "김유신", 12345);
	
	customerlist.add(customerLee);
	customerlist.add(customerShin);
	customerlist.add(customerHong);
	customerlist.add(customerShin);
	customerlist.add(customerYoul);
	customerlist.add(customerKim);
	
	System.out.println("===== 고객 정보 출력 =====");
	for(Customer customer : customerlist) {
		System.out.println(customer.showCustomerInfo());
	}
	
	System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		int price = 10000;
		for(Customer customer : customerlist) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " 님이"
					+ cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 "
					+ customer.bonusPoint + "점입니다.");
			
		}
		
	}
}
