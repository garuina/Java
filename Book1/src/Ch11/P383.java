package Ch11;

public class P383 {
	public static void main(String[] args) throws ClassNotFoundException,
	InstantiationException, IllegalAccessException{
			
		Person person1 = new Person();
		System.out.println(person1);
			
			
		Class pClass = Class.forName("Ch11.Person");	
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
		
	}
}
