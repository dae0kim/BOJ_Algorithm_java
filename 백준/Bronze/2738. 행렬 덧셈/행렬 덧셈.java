import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine()," ");

	   int n,m;
	   n = Integer.parseInt(st.nextToken());
	   m = Integer.parseInt(st.nextToken());

	   int[][] matrixA = new int[n][m];
	   int[][] matrixB = new int[n][m];
	   int[][] matrixSum = new int[n][m];
		

	   for (int i=0; i<n; i++){
		   st = new StringTokenizer(br.readLine()," ");
		   for (int j=0; j<m; j++){
			   matrixA[i][j] = Integer.parseInt(st.nextToken());
		   }
	   }

	   for (int i=0; i<n; i++){
		   st = new StringTokenizer(br.readLine()," ");
		   for (int j=0; j<m; j++){
			   matrixB[i][j] = Integer.parseInt(st.nextToken());
		   }
	   }

	   for (int i=0; i<n; i++){
		   for (int j=0; j<m; j++){
			   matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];
		   }
	   }

	   for (int i=0; i<n; i++){
		   for (int j=0; j<m; j++){
			   System.out.print(matrixSum[i][j]+" ");
		   }
		   System.out.println();
	   }
		br.close();
    }
}