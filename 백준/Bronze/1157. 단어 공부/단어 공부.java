import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int[] alp = new int[26];

		st = new StringTokenizer(br.readLine());
		String str = st.nextToken().toUpperCase();
		
		int max = -1;
		char ch = '?';

		for (int i=0; i<str.length(); i++){
			alp[str.charAt(i)-65]++;
			if (max<alp[str.charAt(i)-65]){
				max = alp[str.charAt(i)-65];
				ch = str.charAt(i);
			}else if (max == alp[str.charAt(i)-65]){
					ch = '?';
			}
		}
		bw.write(ch);

		br.close();

		bw.flush();
		bw.close();		
	
    }
}