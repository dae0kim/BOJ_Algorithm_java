import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());

		for (int i=0; i<t; i++){
			st = new StringTokenizer(br.readLine()," ");
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			
			int a = (num/h);	
			int b = (num%h);	
			int result;			

			if (b==0){
				result =(h*100)+a; 
			}else{
				if (a==0){
					result = (b*100)+1;
				}else{
					result = (b*100)+(a+1);
				}
			}

			bw.write(result+"\n");
		}
		br.close();

		bw.flush();
		bw.close();
	
    }
}