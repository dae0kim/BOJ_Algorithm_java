import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int max;
        max = 0;
        
        int[] array = new int[9];
        
        for(int i=0; i<9; i++){
            st = new StringTokenizer(br.readLine());
            array[i] = Integer.parseInt(st.nextToken());
            if(array[i]>max){
                max = array[i];
            }
        }
        
        int cnt;
        cnt=0;
        int i;
        i=0;
        
        while(true){
            if(array[i]==max){
                cnt++;
                break;
            }
            i++;
            cnt++;
        }
        
        System.out.println(max);
        System.out.println(cnt);
        
    }
}