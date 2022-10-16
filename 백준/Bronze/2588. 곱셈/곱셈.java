import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int num1,num2;
        int first,sec,thr;
        
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        first = num2 % 10;
        sec = (num2/10)%10;
        thr = num2/100;
        
        System.out.println(num1*first);
        System.out.println(num1*sec);
        System.out.println(num1*thr);
        System.out.println(num1*num2);
    }
}