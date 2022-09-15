package Ch15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class P545 {
	public static void main(String[] args) {
		long milisecond = 0;
		try {
			FileInputStream fis  = new FileInputStream("a.zip");
			FileOutputStream fos = new FileOutputStream("cozy.zip");
			
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		milisecond = System.currentTimeMillis();
		int i;
		while((i = bis.read()) != -1 ) {
			bos.write(i);
		}
		milisecond = System.currentTimeMillis() - milisecond;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사하는데 " + milisecond + "milliseconds 소요되었습니다.");
	}
}
