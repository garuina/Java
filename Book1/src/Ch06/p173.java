package Ch06;

	//속성(변수) 
	class Person {
		String name;
		int age;
	
	// this로 생성자 호출
	Person() {
		this("이름 없음", 1);
	}
	
	Person(String name, int age){ 
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;
	}
}
	
public class p173 {
	public static void main(String[] args) {
		Person noName = new Person ();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName); 
	}
}
