import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int first,sec,thr;
        int temp=0;
        int money=0;
        
        first = sc.nextInt();
        sec = sc.nextInt();
        thr = sc.nextInt();
        
        if((first==sec)&&(sec==thr)){
            money = 10000 + (first*1000);
            System.out.println(money);
        }else if((first==sec)||(sec==thr)||(first==thr)){
            if(first==sec){
                money = 1000 + (first*100);
                System.out.println(money);
            } else if(sec==thr){
                money = 1000 + (sec*100);
                System.out.println(money);
            }else{
                money = 1000 + (thr*100);
                System.out.println(money);
            }
        }else{
            temp = first;
            if(sec > thr){
                if(sec > temp){
                    temp = sec;
                }
            }else{
                if(thr > temp){
                    temp = thr;
                }
            }
            money = temp*100;
            System.out.println(money);
        }
    }
}