import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	   StringTokenizer st;

	   st = new StringTokenizer(br.readLine());
	   
	   int c = Integer.parseInt(st.nextToken());

		for (int i=0; i<c; i++){
			st = new StringTokenizer(br.readLine()," ");
			int stdCnt = Integer.parseInt(st.nextToken());

			int[] arr = new int[stdCnt];

			int sum = 0;
			double avg = 0;
			String answer;

			for (int j=0; j<arr.length; j++){
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
		
			avg = sum/(double)stdCnt;
			
			int count=0;

			for (int k=0; k<stdCnt; k++){
				if ((double)arr[k] > avg){
					count++;
				}else{
					continue;
				}
			}

			double result = ((double)count/(double)stdCnt)*100;
			answer = (String.format("%.3f",result));
			
			bw.write(answer + "%\n");
		}
		br.close();

		bw.flush();
		bw.close();
    }
}