import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = 1000000;
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        long[] sum = new long[n+2];
        sum[0] = 0;
        sum[1] = 0;
        for (int p = 2; p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p; i <= n; i += p) {
                    isPrime[i] = false;
                }
                sum[p] = sum[p-1]+ p;
            }else{
                sum[p] = sum[p-1];
            }
        }
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int num = scanner.nextInt();
            
            System.out.println(sum[num]);
        }
    }
}
