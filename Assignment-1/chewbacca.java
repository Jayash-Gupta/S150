//problem: https://hack.codingblocks.com/app/contests/3446/132/problem
import java.util.*;
public class chewbacca {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String  s=sc.next();
        int x=s.length();
        for(int i=0 ; i<x ; i++){
            int t = Character.getNumericValue(s.charAt(i));
            int k = 9-t;
            if(t==9 && i==0)
            {System.out.print(t);
                continue;}
            else if(t<k)
                System.out.print(t);
            else
                System.out.print(k);
        }
    }
}
