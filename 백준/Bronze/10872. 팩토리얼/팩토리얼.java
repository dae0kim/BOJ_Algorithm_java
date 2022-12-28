import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(fct(n));
		
		sc.close();
	}
	
	public static int fct(int n) {
		if(n==0 || n==1) {
			return 1;
		}else {
			int answer = n*(n-1);
			n = n-2;
			while(n>=1) {
				answer = answer*n;
				n--;
			}
			return answer;
		}
	}
}