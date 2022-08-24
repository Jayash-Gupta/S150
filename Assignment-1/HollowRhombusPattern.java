//problem: https://hack.codingblocks.com/app/contests/3446/231/problem
import java.util.*;
public class HollowRhombusPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len=(n*2)-1;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=(n-i) ; j++){
                System.out.print(" ");
            }
            if(i==1 || i==n){
                for(int k=0 ; k<n ; k++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int k=0 ; k<n-2 ; k++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}