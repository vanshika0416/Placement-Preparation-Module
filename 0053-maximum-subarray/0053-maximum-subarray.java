class Solution {
    public int maxSubArray(int[] arr)
    {
        int res=arr[0];
        int minval=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            minval=Math.max(minval+arr[i],arr[i]);
            res=Math.max(minval,res);
        }
        return res;
    }
}