import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[] arr = new int[5];
		
		int sum = 0;
		int avg = 0;
		int middle = 0;

		for (int i=0; i < arr.length; i++){
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		Arrays.sort(arr);
        
        avg = sum/5;
		middle = arr[2];
		
		System.out.println(avg);
		System.out.println(middle);
		br.close();
    }
}