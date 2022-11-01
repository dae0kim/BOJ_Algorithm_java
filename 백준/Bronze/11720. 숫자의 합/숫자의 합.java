import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;


		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(),"");
		String s = st.nextToken();
		
		char[] ch = s.toCharArray();

		int sum = 0;

		for (int i=0; i<n; i++){
			sum += Character.getNumericValue(ch[i]);
		}

		System.out.print(sum);
		
		br.close();
    }
}