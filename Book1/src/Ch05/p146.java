package Ch05;

public class p146 {

	public static void main(String[] args) {
		Student studentAhn = new Student(); // student 클래스 생성
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
	}
}
