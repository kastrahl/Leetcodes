class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        int i=digits.length-1;
        int temp=0,n=0,carry=0;
        while(i>=0)
        {
            if(digits[i]<9)
            {
                digits[i] += 1;
                return digits;
            }
            else
            {
                digits[i]=0;
                carry = 1;
            }
            i--;
        }
        if(carry!=0)
        {
            int[] newarr=new int[digits.length+1];
            newarr[0]=1;
            for(i=1;i<=digits.length;i++)
            {
                newarr[i]=0;
            }
            return newarr;
        }
        return digits;
    }
}
