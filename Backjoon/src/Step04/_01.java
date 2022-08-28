package Step04;

import java.util.Arrays;
import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		int [] arr1 = new int [n];
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		Arrays.sort(arr1);
		System.out.println(arr1[0] + " " + arr1[n-1]);
		
	}
}
