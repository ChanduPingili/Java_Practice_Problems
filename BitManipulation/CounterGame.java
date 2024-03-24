package BitManipulation;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'counterGame' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts LONG_INTEGER n as parameter.
   */

  public static String counterGame(long n) {
    // Write your code here
    if (n == 1)
      return "Louise";
    boolean flag = true;
    while (n != 1) {
      n = louise(n);
      flag = !flag;
    }
    if (!flag)
      return "Louise";
    else
      return "Richard";
  }

  public static long louise(long n) {
    if ((n & (n - 1L)) == 0)
      return n / 2;
    long j = 1L << 63;
    while ((n & j) == 0) {
      j = j >> 1;
    }
    return n - Math.abs(j);
  }

}

public class CounterGame {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int t = Integer.parseInt(bufferedReader.readLine().trim());

    IntStream.range(0, t).forEach(tItr -> {
      try {
        long n = Long.parseLong(bufferedReader.readLine().trim());

        String result = Result.counterGame(n);

        bufferedWriter.write(result);
        bufferedWriter.newLine();
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    bufferedReader.close();
    bufferedWriter.close();
  }
}
