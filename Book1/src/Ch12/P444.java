package Ch12;

public class P444 {
	public static void main(String[] args) {
	 MemberTreeMap MemberHashMap = new MemberTreeMap();
	 
	 Member memberPark = new Member(1003, "박서훤");
	 Member memberLee  = new Member(1001, "이지원");
	 Member memberHong = new Member(1004, "홍길동");
	 Member memberSon  = new Member(1002, "손민국");

	 MemberHashMap.addMember(memberPark);
	 MemberHashMap.addMember(memberLee);
	 MemberHashMap.addMember(memberHong);
	 MemberHashMap.addMember(memberSon);
	 
	 MemberHashMap.showAllMember();
	 
	 MemberHashMap.removeMember(1004);
	 MemberHashMap.showAllMember();
		
}
}
