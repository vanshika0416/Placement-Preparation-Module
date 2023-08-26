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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String str) 
    {
        // code here
        char ch[]=str.toCharArray();
        int low=0;
        int high=str.length()-1;
        while(low<high)
        {
            if(ch[low]!=ch[high])
            {
                return 0;
            }
            low++;
            high--;
        }
        return 1;
        
    }
};