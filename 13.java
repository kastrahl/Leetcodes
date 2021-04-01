import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    System.out.println (romanToNumber("XIV"));
  }
  
    static int value(char r)
        {
            if (r == 'I')
                return 1;
            if (r == 'V')
                return 5;
            if (r == 'X')
                return 10;
            if (r == 'L')
                return 50;
            if (r == 'C')
                return 100;
            if (r == 'D')
                return 500;
            if (r == 'M')
                return 1000;
            return -1;
        }
    public static int romanToNumber(String str)
        {
            int num=0;
            for(int i=0;i<str.length();i++)         //TRAVERSE WHOLE LIST
            {
                int c1 = value(str.charAt(i));      //THE PREVIOUS CHARACTER'S NUMERICAL VALUE
                if (i + 1 < str.length())           //IF THERE IS A NEXT ELEMENT
                    {
                        int c2 = value(str.charAt(i + 1));  //VALUE OF NEXT CHARACTER
                     if (c1 >= c2)                          //IF BIGGER LETTER COMES FIRST AND SMALLER NEXT (XI=11)
                        {
                            num = num + c1;
                        }
                     else                                   //IF PREVIOUS IS SMALLER THAN NEXT(MEANING THERE IS IX = 9)
                        {
                            num = num + c2 - c1;
                            i++;                            //proceed the counter ahead two places as next element is already checked 
                        }
                    }
                else
                num=num+c1;                                 //if there is no next value simply add , no need to check 
            }
            return num;
        }
}
