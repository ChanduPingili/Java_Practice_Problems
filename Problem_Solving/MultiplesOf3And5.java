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
            n--;
            long sum = 0;
            long n1 = n/3;
            long n2 = n/5;
            long n3 = n/15;
            long sum1 = n1*(n1+1)/2;
            sum1 *= 3;
            long sum2 = n2*(n2+1)/2;
            sum2 *= 5;
            long sum3 = n3*(n3+1)/2;
            sum3 *= 15;
            sum = sum1 + sum2 - sum3;
            System.out.println(sum);
        }
        
    }
}
