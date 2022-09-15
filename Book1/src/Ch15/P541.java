package Ch15;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class P541 {
	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"));
			int i;
			while((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
