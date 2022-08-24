//https://hack.codingblocks.com/app/contests/3446/740/problem
import java.util.*;
public class Magic {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int len=(n*2)-1, a=4;
        for(int i=1 ; i<=len ; i++){
            int c=0, d=len-2;
            if(i==1 || i==len){
                for(int j=0 ; j<len ; j++){System.out.print("*");}
            }
            else{
                if(i<(len/2)+1){
                    for(int k=0 ; k<=n-i ; k++){
                        System.out.print("*");
                        c+=1;
                    }
                    for(int l=0 ; l<len-(2*c) ; l++){
                        System.out.print(" ");
                    }
                    for(int k=0 ; k<=n-i ; k++){
                        System.out.print("*");
                    }
                }
                else{
                    // d-=2;
                    for(int k=0 ; k<a/2-1 ; k++){
                        System.out.print("*");
                    }
                    for(int l=0 ; l<len-a+2 ; l++){
                        System.out.print(" ");
                    }

                    for(int t=0 ; t<a/2-1 ; t++){
                        System.out.print("*");
                    }
                    a+=2;
                }
            }
            System.out.println();
        }
    }
}