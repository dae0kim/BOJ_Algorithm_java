import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
       Scanner sc = new Scanner(System.in);
		
		int[] stdArr = new int[30];
		int[] inputArr = new int[28];

		for (int i=1; i<=stdArr.length; i++){
			stdArr[i-1] = i;
		}

		for (int i=0; i<inputArr.length; i++){
			inputArr[i] = sc.nextInt();
		}

		for (int i=0; i<stdArr.length; i++){
			for (int j=0; j<inputArr.length; j++){
				if (stdArr[i]==inputArr[j]){
					stdArr[i]=0;
				}
			}
		}

		Arrays.sort(stdArr);


		System.out.println(Math.min(stdArr[28],stdArr[29]));
		System.out.println(Math.max(stdArr[28],stdArr[29]));

		

    }
}