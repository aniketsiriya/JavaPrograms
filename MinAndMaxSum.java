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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        
        long min=arr.get(1);
        for(int i=0; i<arr.size();i++)
        {
            if(min>arr.get(i))
            {
                min=arr.get(i);
            }
        }
      // System.out.println(min);
       
       long max=arr.get(1);
        for(int i=0; i<arr.size();i++)
        {
            if(max<arr.get(i))
            {
                max=arr.get(i);
            }
        }
       //System.out.println(max);
    long total=0;
    for(int i=0; i<arr.size();i++)
    {
        total=total+arr.get(i);
    }
    //System.out.println(total);
    System.out.print(total-max);
    System.out.print(" ");
    System.out.print(total-min);
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = new ArrayList<>(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList()));

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}