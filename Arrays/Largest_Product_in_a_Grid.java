import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] grid = new int[20][20];
        for(int grid_i=0; grid_i < 20; grid_i++){
            for(int grid_j=0; grid_j < 20; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 20;i++){
            for(int j = 0; j < 20 ; j++){
                int right = Integer.MIN_VALUE;
                if(j < 17)
                    right = grid[i][j]*grid[i][j+1]*grid[i][j+2]*grid[i][j+3];
                    
                int down = Integer.MIN_VALUE;
                if(i < 17)
                    down = grid[i][j]*grid[i+1][j]*grid[i+2][j]*grid[i+3][j];
                int diag = Integer.MIN_VALUE;;
                if(j < 17 && i <17)
                    diag = grid[i][j]*grid[i+1][j+1]*grid[i+2][j+2]*grid[i+3][j+3];
                int diagl = Integer.MIN_VALUE;
                if(j > 2 && i <17){
                    diagl = grid[i][j]*grid[i+1][j-1]*grid[i+2][j-2]*grid[i+3][j-3];
                }
                max = Math.max(right,max);
                max = Math.max(max,diag); 
                max = Math.max(max,down);
                max = Math.max(max,diagl); 
            }
        }
        
        
        
        System.out.println(max);
    }
}
