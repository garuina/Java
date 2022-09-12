package Step06;

import java.util.Scanner;

public class _09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		int cnt = 0;
		int tot = 0;
		
		String arr1 [] = {"c=", "c-", "dz=",
						"d-", "lj", "nj",
						"s=", "z="}; 
		for(int i=0; i<A.length()-1; i++) {
			String B = A.substring(i, i+2);
			for(int j=0; j<arr1.length;j++) {
				if(B.equals(arr1[j])) {
					cnt+=1;
				}
			}tot = (A.length() - cnt*2)+cnt;
		}System.out.println(tot);
	}
}
