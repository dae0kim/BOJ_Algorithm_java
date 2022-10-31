import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		String s = st.nextToken();

		char[] word = s.toCharArray();

		int[] n = new int[26];
		for (int i=0; i<26; i++){
			n[i] = -1;
		}

		int asc = 0;
		
		for (int i=0; i<word.length; i++){
			asc = ((int)word[i])-97;
			if (n[asc] == -1){
				n[asc] = i;
			}
		}

		for (int i=0; i<26; i++){
			System.out.print(n[i]+" ");
		}
			
    }
}