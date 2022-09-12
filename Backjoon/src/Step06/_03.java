package Step06;

import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		for(int i =97; i<123; i++) {
			char x = (char) i;
			System.out.print(s.indexOf(x) + " ");
			
		}
		
	}
}
