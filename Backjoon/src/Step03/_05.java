package Step03;

import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class _05 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bW = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringTokenizer st;
		
		for(int i=0; i<TC; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int sum = A+B;
 
            bw.write(sum + "\n");
        }
        bw.flush();
    }
		
	}
}
