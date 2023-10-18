//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                adj.get(u).add(v);
            }

            Solution obj = new Solution();
            List<Integer> safeNodes = obj.eventualSafeNodes(V, adj);
            for (int i : safeNodes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {

        // Your code here
        List<Integer> res=new ArrayList<>();
        boolean[] visit=new boolean[V];
        for(int i=0;i<V;i++){
            if(!isCycle(i,adj,visit)){
                res.add(i);
            }
        }
        return res;
    }
    private static boolean isCycle(int source,List<List<Integer>> adj,boolean[] visit){
       
        visit[source]=true;
        
        for(Integer it:adj.get(source)){
            if(!visit[it]){
                if(isCycle(it,adj,visit)) return true;
            }else return true;
    
        }
        visit[source]=false;
        return false;
    }
}
