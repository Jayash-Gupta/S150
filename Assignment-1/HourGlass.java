//problem: https://hack.codingblocks.com/app/contests/3446/1364/problem
import java.util.*;
public class HourGlass {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i=0;i<=N;i++){
            int it = N-i;
            int it2 =0;
            for (int j=0;j<i;j++){
                System.out.print("  ");
            }
            for (int j=0;j<=N*2-i*2;j++){
                if(it>0){
                    System.out.print(it+" ");
                    it2=it;
                    it--;
                }else if(j==N-i){
                    System.out.print(0+" ");

                }else{
                    System.out.print(it2+" ");
                    it2++;
                }

            }
            System.out.println();
        }
        // for lower triangle
        for (int i=0;i<N;i++){

            int it2 =0;
            int it = N;
            for (int j=1;j<N-i;j++){
                System.out.print("  ");
                it--;
            }
            for (int j=0;j<=((i+1)*2);j++){

                if(it>0){
                    System.out.print(it+" ");

                    it--;
                }else if(j==0){
                    System.out.print(0+" ");
                    it--;

                }else{
                    System.out.print(it2+" ");
                    it2++;
                }

            }
            System.out.println();

        }

    }
}