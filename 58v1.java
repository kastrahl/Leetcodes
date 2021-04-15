import java.math.*;
public class Main
{
    public static int lengthOfLastWord(String s) 
    {
        s=s.trim();
        System.out.println(s.length());
        s=s+Character.toString(' ');
        System.out.println(s.length());
        s=Character.toString(' ')+s;
        System.out.println(s.charAt(0));
        int prevb=0,currb=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                prevb = currb;
                currb = i;
            }
        }
        int length = currb-prevb-1;
        if(length>0)
        return length;
        else 
        return 0;
    }
	public static void main(String[] args)
    {
        String s="hello world";
 
        System.out.println("length of word " + lengthOfLastWord(s));
    }
}
