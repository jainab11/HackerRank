import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
        import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Scanner scanner = new Scanner(System.in);
        int lineNumber = 0;
        
        while (scanner.hasNext()) {
            lineNumber++;
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
        }
    
    }
}
