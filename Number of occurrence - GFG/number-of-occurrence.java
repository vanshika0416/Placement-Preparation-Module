//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x)
    {
        // code here
        int first=firstocc(arr,n,x);
        if(first==-1)return 0;
        return lastocc(arr,n,x)-first+1;
    }
    int firstocc(int arr[],int n,int x)
    {
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(x>arr[mid])
            {
                low=mid+1;
            }
            else if(x<arr[mid])
            {
                high=mid-1;
            }
            else
            {
                if(mid==0 || arr[mid]!=arr[mid-1])
                return mid;
                else
                high=mid-1;
            }
        }
        return -1;
    }
    int lastocc(int arr[],int n,int x)
    {
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(x>arr[mid])
            {
                low=mid+1;
            }
            else if(x<arr[mid])
            {
                high=mid-1;
            }
            else
            {
                if(mid==n-1 || arr[mid]!=arr[mid+1])
                return mid;
                else
                low=mid+1;
            }
        }
        return -1;
    }
    
}