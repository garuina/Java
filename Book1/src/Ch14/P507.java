package Ch14;

import Ch08.AnimalTest;

public class P507 {
	private String userID;
	
	public String getUserID() {
		return userID;
	}


public void setUserID(String userID) throws IDFormatException{
	if(userID == null) {
		throw new IDFormatException("아이디는 null일 수 없습니다.");
	}else if (userID.length() < 8 || userID.length() >20) {
		throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
	}
	this.userID = userID;
}


public static void main(String[] args) {
	P507 test = new P507();
	
	String userID = null;
	try {
		test.setUserID(userID);
	} catch (Exception e) {
	  System.out.println(e.getMessage());
	}
	
	userID = "1234567";
	try {
		test.setUserID(userID);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}


}