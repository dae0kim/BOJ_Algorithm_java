import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int input_hour,input_min,cooking_time;
        int trans_hour,trans_min;
        int output_hour,output_min;
        
        input_hour = sc.nextInt();
        input_min = sc.nextInt();
        cooking_time = sc.nextInt();
        
        trans_hour = cooking_time / 60;
        trans_min = cooking_time % 60;
        
        output_hour = input_hour + trans_hour;
        output_min = input_min + trans_min;
        
        if(output_min >= 60){
            output_hour = output_hour+1;
            output_min = output_min-60;
            if(output_hour >= 24){
                output_hour = output_hour - 24;
            }
        }else{
            if(output_hour >= 24){
                output_hour = output_hour - 24;
            }            
        }
        
        System.out.println(output_hour);
        System.out.println(output_min);
        
    }
}