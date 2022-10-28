import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int cnt=0;
		int sum=0;

		for (int i=0; i<n; i++){
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			char[] c = str.toCharArray();
			for (int j=0; j<c.length; j++)	{
				if (c[j]=='O'){
					cnt++;
					sum += cnt;
				}else{
					cnt=0;
				}
			}
			bw.write(sum+"\n");
			sum=0;
			cnt=0;
		}
		br.close();

		bw.flush();
		bw.close();
		
    }
}