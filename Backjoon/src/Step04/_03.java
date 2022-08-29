package Step04;

import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr1 [] = new int [10];
		
		int count = 0;
		
		
		for (int i=0; i<10; i++) {
			arr1[i] = sc.nextInt() % 42;
		}
		
		for(int i =0; i<10; i++) {
			int t = 0;
			for(int k =i +1;k<10;k++) {
				if(arr1[i]==arr1[k]) {
					t++;
			 }
			}
			if(t==0) {
				count++;
		 }
		}
		System.out.println(count);
}
}