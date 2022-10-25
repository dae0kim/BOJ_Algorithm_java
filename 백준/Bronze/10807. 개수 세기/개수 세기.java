import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;

	   int cnt = 0;

	   st = new StringTokenizer(br.readLine());
	   int n = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n]; 

		st = new StringTokenizer(br.readLine()," ");
	   for (int i=0; i<n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
	   }

		st = new StringTokenizer(br.readLine()," ");
		int v = Integer.parseInt(st.nextToken());

		for (int j=0; j<n; j++){
			if (arr[j]==v){
				cnt++;
			}else{
				continue;
			}
		}
	    br.close();
		
	    System.out.println(cnt);
	  
    }
}