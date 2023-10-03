//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String str) 
    {
        // Code here
        ArrayList<String> lst=new ArrayList<>();
        char ch[]=str.toCharArray();
        permutation(ch,lst,0);
         Collections.sort(lst);
         return lst;
    }
    public void permutation(char ch[],ArrayList<String> lst,int idx)
    {
        if(idx==ch.length-1)
        {
            if(!lst.contains(new String(ch)))
            lst.add(new String(ch));
        }
        for(int i=idx;i<ch.length;i++)
        {
            swap(ch,i,idx);
            permutation(ch,lst,idx+1);
            swap(ch,idx,i);
        }
    }
    public void swap(char ch[],int start,int end)
    {
        char temp=ch[start];
        ch[start]=ch[end];
        ch[end]=temp;
    }
}