import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int i;
	    System.out.println("number of elements in array");
	    
	    Scanner input = new Scanner(System.in); 
        int size = input.nextInt();
        int[] arr=new int[size];
        
        System.out.println(" elements in array");
        for( i=0;i<size;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.print(removeDuplicates(arr));
        System.out.print(Arrays.toString(arr));

        
	}
    public static int removeDuplicates(int[] nums) 
	{
	    
        int i=0,count=0,pos=0,newsize=0;
        if(nums.length==0)
	    {
	        return newsize;
	    }
	    else
	    if(nums.length==1)
	    {
	        return newsize=1 ;
	    }
	    else
        for(i=1;i< nums.length;i++)
        {
            if(nums[i-1]==nums[i])
            {
                count++;
            }
            else
            {
                count=0;
                nums[pos++]=nums[i-1];
                newsize++;
            }
        }
            nums[pos++]=nums[i-1];
            newsize++;
        return newsize;
    }
}

