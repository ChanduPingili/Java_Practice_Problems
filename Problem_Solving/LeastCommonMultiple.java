import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            System.out.println(smallMultiple(n));
        }
    }
    
    public static long smallMultiple(int num){
        long prod = 1;
        for(long i =2; i <=num;i++)
            prod = lcm(prod, i);
        return prod;
    }
    
    public static long lcm (long a, long b ){
        return (a*b)/gcd(a,b);
    }
    
    public static long gcd(long a , long b){
        while(b != 0){
            long temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
