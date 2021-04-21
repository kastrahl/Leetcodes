class Solution 
{
    public static int[] memory;
    
    public int climbStairs(int n) 
    {
        memory = new int[n];
        int x = reclimbStairs(n);
        return x;
    }
    public int reclimbStairs(int n) 
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        if(memory[n-1]!=0)
            return memory[n-1];
        
        memory[n-1] = reclimbStairs(n-1) + reclimbStairs(n-2);
       
        return memory[n-1];
    }
}
