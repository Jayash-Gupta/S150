//problem: https://hack.codingblocks.com/app/contests/3446/215/problem
import java.util.*;
public class LCM {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int i=1, n1=sc.nextInt(), n2=sc.nextInt(), flag=0;
        while(flag!=1){
            if(i%n1==0 && i%n2==0){
                System.out.print(i);
                flag=1;
            }
            i++;
        }
    }
}