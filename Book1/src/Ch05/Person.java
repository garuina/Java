package Ch05;

public class Person {
	//생성자 만들기
	String name;
	float height;
	float weight;
	
	public Person() {}
	
	//디폴트 생성자
	public Person(String pname) {
		name = pname;
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
	
}
