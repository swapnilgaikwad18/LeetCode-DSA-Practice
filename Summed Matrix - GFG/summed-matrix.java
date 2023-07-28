//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            long n = Long.parseLong(S[0]);
            long q = Long.parseLong(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.sumMatrix(n,q));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static long sumMatrix(long n, long q) {
        long firstRowMax = n + 1;
        if (firstRowMax == q) {
            return n;
        } 
        else if (q < firstRowMax) {
            return q - 1;
        } 
        else {
            long maxVal = 2 * n;
            if (q > maxVal) {
                return 0;
            } 
            else {
                long startRow = q - n;
                return n - startRow + 1;
            }
        }
    }
};