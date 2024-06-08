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
import java.time.Clock;
import java.time.LocalTime;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
       
       int hour=Integer.parseInt(s.substring(0,2));
       int minute=Integer.parseInt(s.substring(3,5));
       int second=Integer.parseInt(s.substring(6,8));
       
       if (s.contains("PM") && hour != 12)
       {
           hour+=12;
       }
       if (s.contains("AM") && hour == 12)
       {
           hour=0;
       }
       
       
       
       
       
       return String.format("%02d:%02d:%02d",hour,minute,second);
       
        
       
    }

}

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