//https://hack.codingblocks.com/app/contests/3446/571/problem
import java.util.*;
public class Mountain {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                if(i==N && j==N)
                    continue;
                System.out.print(j+"      ");


            }
            for(int j=0;j<=((N*2)-(2*(i+1)));j++){
                System.out.print("       ");

            }
            for(int j=i;j>=1;j--){
                System.out.print(j+"      ");


            }

            System.out.println();
        }

    }
}