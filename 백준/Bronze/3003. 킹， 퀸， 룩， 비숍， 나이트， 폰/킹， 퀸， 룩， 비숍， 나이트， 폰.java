import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int king, queen;
        int rook, bishop, knight;
        int pwan;
        
        king = sc.nextInt();
        queen = sc.nextInt();
        rook = sc.nextInt();
        bishop = sc.nextInt();
        knight = sc.nextInt();
        pwan = sc.nextInt();
        
        System.out.println(1-king);
        System.out.println(1-queen);
        System.out.println(2-rook);
        System.out.println(2-bishop);
        System.out.println(2-knight);
        System.out.println(8-pwan);       
    }
}