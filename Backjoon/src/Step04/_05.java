package Step04;

import java.util.Scanner;

public class _05 {
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 
		 String str;
		 for(int i=0; i<t; i++) {
			 str =sc.next();
			 int sum=0, c=0;
			 
			 for(int k=0; k<str.length(); k++) {
				 if(str.charAt(k) == 'O') {
					 c++;
					 sum += c;
				 }else {
					 c = 0;
				 }
			 }System.out.println(sum);
			 
		 }
	 }	
}
