//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String> lst=new ArrayList<>();
        per(S,"",lst);
        Collections.sort(lst);
        return lst;
    }
	  
	public void per(String str,String per,ArrayList<String> lst)
	{
	    if(str.length()==0)
	    {
	        lst.add(per);
	    }
	    for(int i=0;i<str.length();i++)
	    {
	        char ch=str.charAt(i);
	        String newstr=str.substring(0,i)+str.substring(i+1);
	        per(newstr,per+ch,lst);
	    }
	    
	}
}
