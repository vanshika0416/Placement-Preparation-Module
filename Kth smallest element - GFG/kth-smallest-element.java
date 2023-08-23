//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        while(l<=r)
        {
            int p=partition(arr,l,r);
            if(p==k-1)
            return arr[p];
            else if(p>k-1)
            r=p-1;
            else
            l=p+1;
        }
        return -1;
    } 
    public static int partition(int arr[],int l,int r)
    {
        int piv=arr[r];
        int i=l-1;
        for(int j=l;j<r;j++)
        {
            if(arr[j]<piv)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp2=arr[i+1];
        arr[i+1]=arr[r];
        arr[r]=temp2;
        return i+1;
    }
}
