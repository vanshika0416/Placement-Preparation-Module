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
    public List<String> find_permutation(String S)
    {
        // Code here
        ArrayList<String> lst=new ArrayList<>();
        per(S,"",lst);
        Collections.sort(lst);
        return lst;
    }
    
    public static void per(String str,String per,ArrayList<String> lst)
    {
        if(str.length()==0)
        {
            if(!lst.contains(per))
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