package Ch06;

class Date {
	private int year, month, date;
	
	public Date(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Date [year=" + year + ", month = " + month + ", date= " + date + "]";
	}
}

class Employee1 {
	private String name;
	private Date birthDate;
	
	public Employee1(String name, Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", birthDate=" + birthDate + "]";
	}
}
public class P265 {
	public static void main(String[] args) {
		Date birth = new Date(1900, 1, 1);
		Employee1 employee = new Employee1("홍길동", birth);
		System.out.println(employee);
	}
}



