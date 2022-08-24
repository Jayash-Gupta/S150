//problem: https://hack.codingblocks.com/app/contests/3446/456/problem
import java.util.*;
public class PascalTriangle {
    static int binomialCoeff(int n, int k)
    {
        int res = 1;

        if (k > n - k)
            k = n - k;

        for (int i = 0; i < k; ++i)
        {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(binomialCoeff(i, j)+"	");
            }
            System.out.println();
        }
    }
}
