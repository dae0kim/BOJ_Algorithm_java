import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int num, result;
        num = sc.nextInt();
        result=0;
        
        for(int i=1; i<=9; i++){
            result = num*i;
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}