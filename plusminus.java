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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr,int n) 
{
  int pos=0;
  int neg=0;
  int zero=0;
    for(int i=0;i<n;i++)//checking if the number is positive negative or zero
    {
        if(arr.get(i)>0)
        {
            pos++;
        }
        else if(arr.get(i)<0)
        {
            neg++;
        }
        else
        {
            zero++;
        }
    }
   double positivecount=(double)pos/n;//to change the numbers from int to double
   double negativecount=(double)neg/n;
   double zerocount=(double)zero/n;
    
   System.out.printf("%.6f\n",positivecount);
   System.out.printf("%.6f\n",negativecount);
   System.out.printf("%.6f\n",zerocount);
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr,n);

        bufferedReader.close();
    }
}