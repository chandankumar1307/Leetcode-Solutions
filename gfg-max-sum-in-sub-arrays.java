public class gfg-max-sum-in-sub-arrays
{

    public static long pairWithMaxSum(long arr[], long N)
    {
        // Your code goes here
        
        long sum=arr[0];
        long max=0;
        int k=0;
        for(int i=1;i<N;i++){
            sum+=arr[i];
            max=Math.max(max,sum);
            sum-=arr[k];
            k++;
        }
        return max;
    }
}
