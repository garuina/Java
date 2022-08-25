package Step03;

import java.util.Scanner;

public class _01 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 
		 for(int x=1; x<=9; x++) {
			 int y = x * n;
			 System.out.println(n + " * " + x + " = " + y);
		 }
	}
}
