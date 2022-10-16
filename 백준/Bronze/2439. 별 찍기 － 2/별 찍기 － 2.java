import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num;
        num = sc.nextInt();
        
        for(int i=1; i<=num; i++){
            for(int j=num-i; j>0; j--){
                System.out.print(" ");
            }
            for(int k=0; k<i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}