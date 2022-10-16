import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a,b;
        int result;
        result = 0;
        
        StringTokenizer st;
        
        
        while(true){
            st = new StringTokenizer(br.readLine()," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            result = a+b;
            if(result == 0){
                break;
            }
            bw.write(result + "\n");         
        }
        br.close();
            
        bw.flush();
        bw.close();
        
    }
}