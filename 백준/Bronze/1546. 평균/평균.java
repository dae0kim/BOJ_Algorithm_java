import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n=0;
		double sum=0;
		double avg = 0;
		double max=0;

		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());

		double[] array = new double[n];
		
		st = new StringTokenizer(br.readLine()," ");
		
		for (int i=0; i<n; i++)
		{
			array[i] = Double.parseDouble(st.nextToken());
			if (array[i]>max)
			{
				max = array[i];
			}
		}

		for (int j=0; j<n; j++)
		{
			array[j] = (array[j] / max)*100;
			sum += array[j];
		}

		avg = sum/n;

		System.out.println(avg);
     
    }
}