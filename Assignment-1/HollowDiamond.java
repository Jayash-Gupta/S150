//problem: https://hack.codingblocks.com/app/contests/3446/41/problem
import java.util.*;
public class HollowDiamond {
    public static void main(String args[]) {
        // Your Code Here
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(i==1 || j==N || i==N ||j==1 || (i<=(N/2+1)&&j<=(N/2+2)-i) || (i<=N/2&&j>((N/2)-1)+i)){
                    System.out.print("*	");
                }else if(((i>(N/2)+1)&&j<=(N/2+1)-(N-i))||(i>N/2+1&&j>((N/2))+(N-i))){
                    System.out.print("*	");
                }else{
                    System.out.print("	");
                }

            }
            System.out.println();

        }
    }
}
