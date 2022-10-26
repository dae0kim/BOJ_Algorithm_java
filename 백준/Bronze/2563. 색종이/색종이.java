import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[][] paper = new int[100][100];
		int sum = 0;

		st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());

		for (int i=0; i<n; i++){
			st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for (int j=y; j<y+10; j++){
				for (int k=x; k<x+10; k++){
					paper[j][k] = 1;
				}
			}
		}
		

		for (int i=0; i<100; i++){
			for (int j=0; j<100; j++){
				sum += paper[i][j];
			}
		}

		System.out.println(sum);
    }
}