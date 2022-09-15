package Ch15;

import java.io.FileInputStream;

public class P526 {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			byte[]bs = new byte[10];
			int i;
			
			while((i = fis.read(bs)) != -1) {
				for(byte b : bs) {
					System.out.print((char)b);
				}
				System.out.println(":" + i + "바이트 읽음");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
