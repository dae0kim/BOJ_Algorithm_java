import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num;
        num = sc.nextInt();
        
        int a,b;
        int result,temp;
        int cnt;
        cnt=0;
        
        if(num<10){
            a = 0;
            b = num;
        }else{
            a = num/10;
            b = num%10;
        }
        
        while(true){
            temp = a+b;
            
            result = (b*10)+(temp%10);
            cnt++;
            if(num==result){
                break;
            }
            a = result/10;
            b = result%10;
        }
        
        System.out.println(cnt);
        
        
        
    }
}