package Step06;

import java.util.Scanner;

public class _08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		int s = 0;
		
		for(int i =0; i<A.length(); i++) {
			char a = A.charAt(i);
			if(a>=65 && a <68) {
				s += 3;
			}else if (a>=68 && a < 71) {
				s += 4;
			}else if (a>=71 && a < 74) {
				s += 5;
			}else if (a>=74 && a < 77) {
				s += 6;
			}else if (a>=77 && a < 80) {
				s += 7;
			}else if (a>=80 && a < 84) {
				s += 8;
			}else if (a>=84 && a < 87) {
				s += 9;
			}else if (a>=87 && a < 92) {
				s += 10;
			}else {
				s += 11;
			}
	
	}System.out.println(s);
 }
}
