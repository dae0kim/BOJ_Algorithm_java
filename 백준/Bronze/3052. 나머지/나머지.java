import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] input = new int[10];
        int[] remainder = new int[10];

		int answer = 1;
        
        for(int i=0; i<10; i++){
            input[i] = sc.nextInt();
            remainder[i] = input[i]%42;
        }

		Arrays.sort(remainder);

		for (int i=0; i<input.length-1; i++)
		{
			if(remainder[i] != remainder[i+1]){
				answer++;
			}
		}
        
		System.out.println(answer);
     
    }
}