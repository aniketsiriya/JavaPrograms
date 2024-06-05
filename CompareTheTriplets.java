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
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int result;
        int alices=0;
        int bobs=0;
        List<Integer>alice=a;
        List<Integer>bob=b;
        List<Integer> score=new ArrayList<Integer>();//created an Integer list to store the score
    
        
        for(int i=0; i<alice.size(); i++)
        {   //  use .get() method to retrieve list elements
            if(alice.get(i)>bob.get(i))//if alice's score is more
            {
                alices=alices+1;
            }
            else if(alice.get(i)==bob.get(i))//if score is same
            {
                alices=alices;
                bobs=bobs;
            }
            else//if bob's score is more
            {
                bobs=bobs+1;//if bob's score is more
            }
        }
        score.add(alices);
            score.add(bobs);
 return score;
        }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.compareTriplets(a, b);//metod to be edited

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        ); 

        bufferedReader.close();
        bufferedWriter.close();
    }
}