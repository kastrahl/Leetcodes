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
        System.out.println(Arrays.toString(arr));
        System.out.print(removeElement(arr,5));
        System.out.println(Arrays.toString(arr));

        
	}
	
    public static int removeElement(int[] nums, int val) 
    { 
        int flag=0,i=0,newsize=0,backcount=nums.length-1;
        int p1,p2,t;
        if(nums.length==0)
        {
            return newsize;
        }
        else
        if(nums.length==1)
        {
            if(nums[0]!=val)
            return newsize=1;
            else 
            return newsize;
        }
        else
        for(i=0;i<=backcount;i++)
        {
            
            if(nums[i]!=val)        //if element isn't value continue 
            {
                newsize++;
                continue;
            }
            else
            {
                while(nums[backcount]==val&&backcount>=i) //find first elements!=value from back
                {
                    if(backcount==i)   //if all elements are values return newsize=0
                    return newsize;
                    else
                    backcount--;    //decrease backcount to check last elements= value
                }
                t=nums[i];              
                nums[i]=nums[backcount];
                nums[backcount]=t;
                backcount--;
                newsize++;
            }
        }
        return newsize++;
    }
}
