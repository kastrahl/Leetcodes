public class Main
{
  public static void main (String[]args)
  {
    System.out.println (isPalindrome(12321));

  }

    public static boolean isPalindrome(int n) 
    {
        int rev=0,x=n;
        if(n<0)
        {
            return false;
        }
        else 
        {
            while(n!=0)
            {
                rev=rev*10;
                rev=rev+n%10;
                n=n/10;
            }
            if(rev==x)
                return true;
            else
                return false;
        }
    }
}
