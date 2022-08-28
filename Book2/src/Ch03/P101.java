package Ch03;

import java.util.Scanner;

public class P101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("양의 정수를 입력하시오: "+ n);
		System.out.println(n + "의 약수는 다음과 같습니다.");
		
		for(int i=1;i<n;++i) {
			if(n % i==0) {
				System.out.print(i + " ");
			}
		}
		
	}
}
