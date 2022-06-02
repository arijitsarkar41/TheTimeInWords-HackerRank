import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) 
    {
    	
    	String nums[] = { "zero", "one", "two", "three", "four", 
                "five", "six", "seven", "eight", "nine", 
                "ten", "eleven", "twelve", "thirteen", 
                "fourteen", "fifteen", "sixteen", "seventeen", 
                "eighteen", "nineteen", "twenty", "twenty one", 
                "twenty two", "twenty three", "twenty four", 
                "twenty five", "twenty six", "twenty seven", 
                "twenty eight", "twenty nine", 
            }; 
    	
    	if (m == 0) 
            return (nums[h] + " o' clock "); 
      
        else if (m == 1) 
            return ("one minute past " +  nums[h]);
                                            
      
        else if (m == 59) 
            return ("one minute to " +  nums[(h % 12) + 1]);
                             
      
        else if (m == 15) 
           return ("quarter past " + nums[h]); 
      
        else if (m == 30) 
           return ("half past " + nums[h]); 
      
        else if (m == 45) 
        	return ("quarter to " + nums[(h % 12) + 1]); 
                                
      
        else if (m <= 30) 
            return ( nums[m] + " minutes past " +  nums[h]); 
                                                   
      
        else if (m > 30) 
            return (nums[60 - m] + " minutes to " + nums[(h % 12) + 1]);    
                                                 
		return "No a Valid time";

    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
