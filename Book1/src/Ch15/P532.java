package Ch15;

import java.io.FileOutputStream;

public class P532 {
public static void main(String[] args) {
	try(FileOutputStream fos = new FileOutputStream("ouput3.txt")){
		byte[] bs = new byte[26];
		byte data = 65;
		for(int i = 0; i<bs.length; i++) {
			bs[i] = data;
			data++;
		}
		fos.write(bs, 2, 10);
	}catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("출력이 완료되었습니다.");
}
}
