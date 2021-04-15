import java.math.*;
public class Main
{
    public static int maxSubArray(int[] nums) 
    {
        int tempmax=nums[0],totalmax=tempmax;
        for(int i=1;i<nums.length;i++)
        {
            tempmax =Math.max(tempmax+nums[i],nums[i]);
            totalmax=Math.max(tempmax,totalmax);
        }
        return totalmax;
    }
	public static void main(String[] args)
    {
        int arr[] = { 2, 3, 4, 5, 7 };
        int n = arr.length;
        int max_sum = maxSubArray(arr);
 
        System.out.println("Maximum contiguous sum is " + max_sum);
    }
}
