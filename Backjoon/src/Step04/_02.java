package Step04;

import java.util.Arrays;
import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr1 = new int [9];
		int max = 0;
		int index = 0;
		
		for(int i =0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		for(int i =0 ; i<arr1.length; i++) {
			if(arr1[i]>max) {
				max = arr1[i];
				index = i + 1;
						
			}
		}
		
		Arrays.sort(arr1);
		System.out.println(arr1[8]);
		System.out.println(index);
		
		
		
	}
}
