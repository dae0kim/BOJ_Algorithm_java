import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int hour,minute;
        
        int output_hour=0;
        int output_minute=0;
        
        hour = sc.nextInt();
        minute = sc.nextInt();
        
        if(minute < 45){
            if(hour < 1){
                output_hour = 23;
                output_minute = minute+15;
            }else{
                output_hour = hour-1;
                output_minute = minute+15;
            }
        }else{
             output_hour = hour;
             output_minute = minute-45;            
        }
        
        System.out.println(output_hour);
        System.out.println(output_minute);
        
    }
}