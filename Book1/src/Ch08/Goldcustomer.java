package Ch08;

public class Goldcustomer extends Customer {
	double saleRatio;
	
	public Goldcustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
		
		
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
		
	}
	
	
}
