import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String subs;
        if(s.length() > k)
        {
            smallest = s.substring(0,k);
            largest = s.substring(0,k);
        }
        else
        {
            smallest = s.substring(0,s.length());
            largest = s.substring(0,s.length());
        }
        
        for(int i = 1;i<s.length()-(k-1);i++)
        {
            subs = s.substring(i,i+k);
            if(smallest.compareTo(subs)>0)
                smallest = subs;
            else if(largest.compareTo(subs) < 0)
                largest = subs;
        }
        return smallest + "\n" + largest;
    }

