import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;


	   int[][] matrix = new int[9][9];
	   int max = 0;
	   int row=0;
	   int column=0;

	   for (int i=0; i<9; i++){
		   st = new StringTokenizer(br.readLine()," ");
		   for (int j=0; j<9; j++){
			   matrix[i][j] = Integer.parseInt(st.nextToken());
		   }
	   }
	   for (int i=0; i<9; i++){
		   for (int j=0; j<9; j++){
			   if (matrix[i][j] > max){
				   max = matrix[i][j];
			   }
		   }
	   }
	   for (int i=0; i<9; i++){
		   for (int j=0; j<9; j++){
			   if (matrix[i][j] == max){
				   row = i+1;
				   column = j+1;
			   }
		   }
	   }
		System.out.println(max);
		System.out.print(row+" "+column);

    }
}