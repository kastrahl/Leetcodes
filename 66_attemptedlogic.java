class Solution {
    public int[] plusOne(int[] digits) 
    {
        int i=digits.length,temp=0;
        int k=i-1;
            if(digits[k]<9)
            {
                digits[k] = digits[k]+1;
                return digits;
            }
            else
            if(i>1 && digits[0]!=9)
            {   
                while(k>=0 && digits[k]==9)
                {
                    digits[k]=0;
                    if(digits[k-1]<9)
                    {
                        digits[k]=0;
                        digits[k-1]+=1;
                        return digits;
                    }
                    k--;
                }
            }   
            int[] newarr=new int[i+1];
            int n=0;
            for(int j=0;j<i;j++)
            {
                n = n*10 + digits[j];
            }
            n += 1;
            i=newarr.length-1;
            while(n>0)
            {
                temp=n%10;
                n=n/10;
                newarr[i]=temp;
                i--;
            }
            return newarr;    
    }     
}
