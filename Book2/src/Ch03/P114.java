package Ch03;

import java.util.Arrays;

public class P114 {
	public static void main(String[] args) {
		int[] numbers = {10, 20, 30};
		for (int i =0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		for(int value : numbers)
			System.out.print(value + " ");
		System.out.println(Arrays.toString(numbers));
	}
}
