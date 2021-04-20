class Solution 
{
    public int mySqrt(int x) 
    {
        if(x==0)
            return x;
        int start=1,end=x,ans=0;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(mid<=x/mid)          //if mid^2 <=x mid is answer and start is after mid
            {
                ans=mid;
                start=mid+1;
            }
            else
            {
                end=mid-1;          //mid^2 >x we see before mid thus end=mid+1
            }
        }
        return ans;
    }
}
