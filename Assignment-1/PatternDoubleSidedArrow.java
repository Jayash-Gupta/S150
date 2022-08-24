//problem: https://hack.codingblocks.com/app/contests/3446/75/problem
import java.util.*;
public class PatternDoubleSidedArrow{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N/2+1; i++) {
            int it = i+1;
            for (int j = 0; j < (N-1)-i*2; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print(it+" ");
                it--;
            }
            for (int j = 0; j < i*2-1; j++) {
                System.out.print("  ");

            }
            int it2 = 1;
            for (int j = 0; j <=i; j++) {
                if(i==0)
                    continue;
                System.out.print(it2+" ");
                it2++;

            }
            System.out.println();
        }
        // for lower tirangle
        for (int i = 1; i <=N/2; i++) {
            int it = N/2+1-i;
            for (int j = 0; j < i*2; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <N/2+1-i; j++) {
                System.out.print(it+" ");
                it--;
            }
            for (int j = 0; j < (N*2-1)-(N+1)-i*2; j++) {
                System.out.print("  ");

            }
            int it2 = 1;
            for (int j = 0; j <N/2+1-i; j++) {
                if (i==N/2){
                    continue;
                }

                System.out.print(it2+" ");
                it2++;

            }
            System.out.println();
        }
    }
}
