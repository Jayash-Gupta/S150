//https://hack.codingblocks.com/app/contests/3446/488/problem
import java.util.Scanner;

public class InvertedHourGlass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int it = 0;
        for (int i=0;i<=N;i++){
            for(int j=0;j<=i;j++){
                if(i==N && j==N)
                    continue;
                System.out.print(N-j+" ");
                it = N-j;
            }
            for (int j=0;j<((N*2+1)-(2*(i+1)));j++){
                System.out.print("  ");
            }
            if(i==N )
                System.out.print(0+" ");
            for (int j=0;j<=i;j++){
                if(i==N && j==N)
                    continue;

                System.out.print(it+" ");
                it++;

            }
            // For lower half
            System.out.println();
        }
        int it2=0;
        for (int i=N;i>0;i-- ){
            for(int j=0;j<i;j++){
                System.out.print(N-j+" ");
                it2 = N-j;
            }
            for (int j=0;j<((N*2+1)-(2*(i)));j++){
                System.out.print("  ");
            }
            for (int j=0;j<i;j++){
                System.out.print(it2+" ");
                it2++;
            }
            System.out.println();
        }
    }
}