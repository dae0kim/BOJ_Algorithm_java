import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int min,max;
        min = 1000000;
        max = -1000000;
        
        int num;
        num = Integer.parseInt(st.nextToken());
        
        int[] array = new int[num];
        
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<array.length; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=0; i<array.length; i++){
            if(array[i]<=min){
                min=array[i];
            }else{
                continue;
            }  
        }        
        
        for(int i=0; i<array.length; i++){
            if(array[i]>=max){
                max=array[i];
            }
            else{
                continue;
            }
        }        
        System.out.println(min+" "+max);
        
    }
}