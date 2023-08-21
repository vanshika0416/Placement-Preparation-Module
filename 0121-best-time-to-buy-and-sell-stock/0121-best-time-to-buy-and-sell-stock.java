class Solution {
    public int maxProfit(int[] arr)
    {
        
        int profit=0;int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>min)
            {
                profit=Math.max(profit,arr[i]-min);
            }
            else
            {
                min=arr[i];
            }
        }
        return profit;
    }
}