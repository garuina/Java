package Step06;

import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int r 	 = sc.nextInt();
			String s = sc.next();
			
			for(int k=0; k<s.length(); k++) { // k번째 문자
				char a = s.charAt(k);
				for(int j=0; j<r; j++) { // r 만큼 반복
					System.out.print(a);
				}
			}System.out.println(" ");
		}
		
	}
}
