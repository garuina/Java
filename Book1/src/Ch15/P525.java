package Ch15;

import java.io.FileInputStream;

public class P525 {
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input.txt")){
			int i;
			while((i=fis.read()) != -1) {
				System.out.println((char)i);
			}
			System.out.println("end");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
