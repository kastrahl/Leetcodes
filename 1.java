import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    int[] nums={1,23,4,12,4,512,24,512,5223,521};
		System.out.println(Arrays.toString(twoSum(nums,16)));
	}
	public static int[] twoSum(int[] nums, int target) 
    {
        int i,j;
        int n=nums.length;
        int[] result =new int[2];
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return null;
    }
}
