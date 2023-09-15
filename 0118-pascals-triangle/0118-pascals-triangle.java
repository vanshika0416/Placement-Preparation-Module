class Solution {
    public List<List<Integer>> generate(int num)
    {
        List<List<Integer>> lst=new ArrayList<List<Integer>>();
        for(int i=0;i<num;i++)
        {
            lst.add(pascal(i));
        }
        return lst;
    }
    public List<Integer> pascal(int n)
    {
        List<Integer> ans=new ArrayList<Integer>();
        ans.add(1);
        if(n==0)
            return ans;
        int last=1;
        int c=n;
        for(int i=1;i<=n;i++)
        {
            last=(last*c)/i;
            ans.add(last);
            c-=1;
        }
        return ans;
    }
}