import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int bill_price;
        bill_price = sc.nextInt();
        
        int num;
        num = sc.nextInt();
        
        int total_price;
        total_price = 0;
        
        for(int i=0; i<num; i++){
            int price,ea;
            price = sc.nextInt();
            ea = sc.nextInt();
            total_price = total_price + (price*ea);
        }
        
        if(bill_price == total_price){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}