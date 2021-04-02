import java.lang.Math.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
	    String a="niggerland595";
	    String b="terminator694634";
	    String[] strs = {"fun","function","fu","funk","funds"};
		System.out.println(longestCommonPrefix(strs));
	}
	public static String longestCommonPrefix(String[] strs) 
    {
        String s1,lcp="";
        int i,j;
        int flag=1;
        if(strs.length==0)
        {
            return lcp;
        }
        s1=strs[0];
        for(i=0;i<s1.length();i++)                  //iterate character of first string in string Array
        {
            for(j=1;j<strs.length;j++)              //iterate through all strings in string array
            {
                if(strs[j].length()<=i)             //if the there is string smaller than selected first string itll break the loop as smallest string will have common longestCommonPrefix
                {
                    break;
                }
                if(strs[j].charAt(i)==s1.charAt(i)) //check the ith character of first string and each string in array
                flag++;                             //counts existence of ith character in each string
            }
            if(flag==strs.length)                   //check if all strings have ith character
            {
                lcp=lcp+String.valueOf(s1.charAt(i));   //join the character in longestCommonPrefix
                flag=1;                                 //set counter to atleast one character
            }
            else
            break;
            
                
        }
        return lcp;
    }
}
        
