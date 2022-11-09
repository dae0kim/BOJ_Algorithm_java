import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());

		int answer = 0;
		
		while(true){
			if (x%5==0){
				answer += x/5;
				break;
			}else{
				x -= 3;
				answer++;
			}
			if (x<0)	{
				answer = -1;
				break;
			}
		}	
		System.out.println(answer);
    }
}