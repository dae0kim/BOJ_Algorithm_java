import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		String str1 = st.nextToken();
		String str2 = st.nextToken();

        String reversedStr1 = new StringBuffer(str1).reverse().toString();
		String reversedStr2 = new StringBuffer(str2).reverse().toString();

		if (Integer.parseInt(reversedStr1) > Integer.parseInt(reversedStr2)){
			bw.write(reversedStr1);
		}else{
			bw.write(reversedStr2);
		}
		br.close();

		bw.flush();
		bw.close();
	
    }
}