import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        String[] arrOfString = str.split(" \\[ !,?._'@] + ");
        int count = 0;
        for(String ele: arrOfString)
        {
            ele.length();
            count++;
        }
        System.out.println(count);
        for(String ele: arrOfString)
        {
            System.out.println(ele);
        }
        sc.close();
    }
}

