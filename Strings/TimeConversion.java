import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        // String[] time = s.split(":");
        // String res = "";
        // if(time[2].substring(2).equals("PM")){
        //     int val = Integer.parseInt(time[0]);
        //     val += 12;
        //     if(val == 24)
        //         val =0;
        //     if(val==0)  
        //         res = "00"+":"+time[1]+":"+time[2].substring(0,2);
        //     else
        //         res = val+":"+time[1]+":"+time[2].substring(0,2);
        // }else{
        //     if(time[0].equals("12"))
        //         time[0] = "00";
        //     res = time[0]+":"+time[1]+":"+time[2].substring(0,2);
        // }
        // return res; 
        String frst=s.substring(0,2); 
        String trd=s.substring(8,9); 
        int d=0; 
        if(frst.equals("12") && trd.equals("A")) 
        return "00"+s.substring(2,8); 
        else if(!frst.equals("12") && trd.equals("P")){ 
            d=Integer.parseInt(frst)+12; 
            return Integer.toString(d)+s.substring(2,8);
        } 
        else 
            return s.substring(0,8);

}}
    

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
