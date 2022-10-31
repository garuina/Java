package Step04;

import java.util.Scanner;

public class new02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr1 [] = new int[30];
		int arr2 [] = new int [2];
		
		for(int i=0; i<28; i++ ) {
			arr1[i] = sc.nextInt();
		}
		
		for(int k=1; k<=30; k++) {
			for(int j=0; j<arr1.length; j++) {
				if(arr1[j] == k) {
					
				}
			}
		}
		
	}
}
