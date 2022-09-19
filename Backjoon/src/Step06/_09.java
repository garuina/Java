package Step06;

import java.util.Scanner;

public class _09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		int cnt1 = 0;
		int cnt2 = 0;
		int tot = 0;
		
		String arr1 [] = {"c=", "c-", "dz=",
						"d-", "lj", "nj",
						"s=", "z="}; 
		
		String B = A.replace("c=", "a");
		String C = B.replace("c-", "a");
		String D = C.replace("dz=", "a");
		String E = D.replace("d-", "a");
		String F = E.replace("lj", "a");
		String G = F.replace("nj", "a");
		String H = G.replace("s=", "a");
		String I = H.replace("z=", "a");
		
				
		System.out.println(I.length());
		
	
		}
	}

