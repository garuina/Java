package Ch06;

 class Person {
	 
	 //속성 (변수)
	String name;
	int age;
	
	// 생성자 부르기
	Person() {
		this("이름 없음",1);
	}
	
	//생성자
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}
//Test
public class p172 {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}
}
