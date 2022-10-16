import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        int case_num;
        case_num = sc.nextInt();
        
        int[] answer = new int[case_num];
        
        int x,y;
        
        for(int i=0; i<case_num; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            answer[i] = x+y;
        }
        
        for(int j=0; j<answer.length; j++){
            System.out.println(answer[j]);
        }
        
    }
}