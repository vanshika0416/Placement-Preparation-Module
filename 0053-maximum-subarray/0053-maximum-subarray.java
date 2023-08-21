class Solution {
    public int maxSubArray(int[] arr)
    {
        int maxending=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            maxending=Math.max(arr[i],arr[i]+maxending);
            res=Math.max(maxending,res);
        }
        return res;
    }
}