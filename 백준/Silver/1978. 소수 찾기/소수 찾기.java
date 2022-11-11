import java.util.*;
import java.io.*;

public class Main{
	boolean prime(int x){
		if (x<2){
			return false;
		}
		if (x==2){
			return true;
		}
		for (int i=2; i<=Math.sqrt(x); i++){
			if (x%i==0){
				return false;
			}
		}
		return true;
}

    public static void main(String[] args) throws IOException{

		Main obj = new Main();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int x;
		int cnt=0;
		
		for (int i=0; i<num; i++){
			x = sc.nextInt();
			if (obj.prime(x)==true){
				cnt++;
			}
		}
		System.out.println(cnt);
    }
}