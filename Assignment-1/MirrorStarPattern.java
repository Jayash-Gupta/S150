//problem: https://hack.codingblocks.com/app/contests/3446/192/problem
import java.util.*;
public class MirrorStarPattern {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(), c=1, d=n-2;
        for(int i=0 ; i<=n ; i++){
            if(i<(n/2)+1){
                for(int j=(n/2)-i ; j>0 ; j--){
                    System.out.print("  ");
                }
                for(int k=0 ; k<c ; k++){
                    System.out.print("* ");
                }
                c+=2;
            }
            else{
                for(int j=0 ; j<i-(n/2) ; j++){
                    System.out.print("  ");
                }
                for(int k=0 ; k<d ; k++){
                    System.out.print("* ");
                }
                d-=2;
            }
            System.out.println();
        }
    }
}
