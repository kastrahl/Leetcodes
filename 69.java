class Solution 
{
    public int mySqrt(int x) 
    {
        double t;
        double sqrt=x/2;
        if(x==0||x==1)
            return x;
        do
        {
            t    = sqrt;
            sqrt = (t+(x/t))/2;
        }while(t-sqrt!=0);
        
        return (int)sqrt ;
    }
}
