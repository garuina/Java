package Ch06;

public class p186 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(Student1.serialNum);
		System.out.println(studentLee.studentName + " 학번:" + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentLee.setStudentName("손수경");
		System.out.println(Student1.serialNum);
		System.out.println(studentLee.studentName + " 학번:" + studentSon.studentID);
		
		
		
	}
}
