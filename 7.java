import java.util.Arrays;
import java.lang.Math;

public class Main
{
  public static void main (String[]args)
  {
    System.out.println (reverse(29521));
  }
  public static int reverse(int x) 
    {
        int digit,temp,rev;
        
        if( x<=Math.pow(-2,31)    ||  x>=(Math.pow(2,31)-1) )
            return 0;
        else
        {
            return rever(x);
        }
    }
  public static int rever (int n)
  {
    int t = 0, rev = 0, pn = 0;
    int ulimit= (int)Math.pow(2,31)-1;
    int llimit= (int)Math.pow(2,31);
    
    if (n < 0)
      {
	    pn = Math.abs (n);
        while (pn > 9)
	     {
	        t = pn % 10;
    	    rev = rev * 10 + t;
	        pn = pn / 10;
	      }
	    if(rev == llimit/10)
	    {
	        if(pn%10>=8)
	        return 0;
	        else
	        return -(rev=rev*10 + pn%10);
	    }
        else
        if(rev<llimit/10)
            return -(rev=rev*10 + pn%10);
        else
            return 0;
      }
    else
      {
	    while (n > 9)
	    {
	       t = n % 10;
	       rev = rev * 10 + t;
	       n = n / 10;
	    }
      }
        if (rev == ulimit/10)
	    {
	        if(n%10>=7)
	        return 0;
	        else
	        return (rev=rev*10 + n%10);
	    }
        else
        if(rev<ulimit/10)
            return (rev=rev*10 + n%10);
        else
            return 0;
  }
}
