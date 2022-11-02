import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;


		st = new StringTokenizer(br.readLine());
		int testNum = Integer.parseInt(st.nextToken());

		for (int i=0; i<testNum; i++){
			st = new StringTokenizer(br.readLine()," ");
			int r = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			char[] ch = str.toCharArray();
			for (int j=0; j<ch.length; j++){
				for (int k=0; k<r; k++){
					bw.write(ch[j]);
				}
			}
			bw.write("\n");
		}
		br.close();

		bw.flush();
		bw.close();
    }
}