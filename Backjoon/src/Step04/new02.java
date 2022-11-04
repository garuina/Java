package Step04;

import java.util.Scanner;

public class new02 {
	static boolean arr1 [] = new boolean[31];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<28; i++ ) {
			int num = sc.nextInt();
			
			arr1[num] = true;
		
		}
		
		for(int i=1; i<=30; i++) {
			if(arr1[i]== false) {
				sb.append(i + " ");
				sb.append('\n');
			}
		}
		
		System.out.println(sb);
		
	}
}
