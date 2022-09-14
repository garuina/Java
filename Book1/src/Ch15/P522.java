package Ch15;

import java.io.FileInputStream;
import java.io.IOException;

public class P522 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
		}catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			}catch (IOException e) {
				System.out.println(e);
			}catch (NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}
}
