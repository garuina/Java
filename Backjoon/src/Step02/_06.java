package Step02;

import java.util.Scanner;

public class _06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int min = b + a *60;
		min += c;
		
		int hour = (min/60) % 24 ;
		int minute = min % 60;
		
		System.out.println(hour + " " + minute);
		
		
		
		
	}
}
