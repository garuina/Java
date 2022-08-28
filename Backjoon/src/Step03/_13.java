package Step03;

import java.util.Scanner;

public class _13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int c = n;
		int tot = 0;
		
		
		while (true) {
			
			n = ((n/10) + (n%10))%10 + (n%10)*10;
			tot ++;
			
			if(n==c) {
				break;
			}
			 
			
		} System.out.println(tot);
	}
}
