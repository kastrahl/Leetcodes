import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    String s="(){}[]";
	    char c;
	    int f1=0,f2=0,f3=0;
	    for(int i=0;i<s.length();i++)
	    {
	        System.out.println(s.charAt(i));
	        if(s.charAt(i)=='[')
	        {
	            f1++;
	        }
	        if(s.charAt(i)=='{')
	        {
	            f2++;
	        }
	        if(s.charAt(i)=='(')
	        {
	            f3++;
	        }
	        if(s.charAt(i)==']')
	        {
	            if(f1>0&&f2==0&&f3==0)
	            f1--;
	        }
	        if(s.charAt(i)=='}')
	        {
	            if(f2>0&&f1==0&&f3==0)
	            f2--;
	        }
	        if(s.charAt(i)==')')
	        {
	            if(f3>0&&f2==0&&f1==0)
	            f3--;
	        }
	    }
	    if(f1==0&&f2==0&&f3==0)
	    System.out.println("valid paranthesis");
	    else
	    System.out.println("not valid paranthesis");
	    
	    System.out.println(f1 +" " +f2 +" " +f3);
	}
}
