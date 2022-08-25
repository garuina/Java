package Ch05;

public class p141 {
	int sudentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudent() {
		return studentName;
	}//학생이름을 가져오는 메서드, 반환값은 studentName이고 
	// 이게 자료형이 String 반환형도 String 
 
	
	public void setDtudentName(String name) {
		studentName = name;
	}
}
