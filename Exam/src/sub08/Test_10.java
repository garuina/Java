package sub08;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.management.Query;

/*
 * 날짜 : 2022/09/29
 * 이름 : 장인화
 * 내용 : 장인화
 */
class User {
	private String uid;
	private String name;
	private String hp;
	private int age;

	public String getUid() {
		return uid;
	}
	
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHp() {
		return hp;
	}
	
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return uid +"," + name +"," +hp + "," + age;
	}
}

public class Test_10 {
	private static String host = "jdbc:mysql://127.0.0.1:3306/java1db";
	private static String user = "root";
	private static String pass = "1234";
	
	public static Connection getConnection() throws SQLException {
		return DriverManger.getConnection(host, user, pass);
	}
	
	public static void main(String[] args) {
		
		query("INSERT INTO `User3` VALUES ('j101', '홍길동', '010-1111-1111', 21)");
		System.out.println("데이터 입력완료...");
		
			result1 = query("select * from `User3`");
			result2 = query("SELECT * FROM `User3` WHERE `uid`='j101'");
			
			System.out.println("------------------------");
			System.out.println("result1 결과");
			for(User user : result1) {
				System.out.println(user);
			}
			System.out.println("--------------------");
			System.out.println("result2 결과");
			for(User user : result2) {
				System.out.println(user);
			}
	}
	
	public static List<User> query(String sql) {
		List<User> users = new ArrayList<>();
		
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = 
					
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
