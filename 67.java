class Solution
{
    public static String addBinary(String aorigin, String borigin) 
    {
        int carry=0,i=0,j=0;
        String a=aorigin ,b=borigin;
        int al=a.length(),bl=b.length();
        String output="";
        char mychar='\0';
        
        if(al<bl)
        {
            output = addBinary(b,a);
            return output;
        }
        if(al>bl)
        {
            for(i=1;i<=al-bl;i++)
            {
                b="0"+b;
            }
        }
        
        for(i=al-1;i>=0;i--)
            {
                if(a.charAt(i)=='1' && b.charAt(i)=='1')
                {
                    if(carry==1)
                    {
                        mychar='1';
                    }
                    else
                    {
                        carry = 1;
                        mychar='0';
                    }
                }
                else
                if(a.charAt(i)=='1'||b.charAt(i)=='1')
                {
                    if(carry==1)
                    {
                        mychar='0';
                    }
                    else
                    {
                        carry = 0;
                        mychar='1';
                    }
                }
                else
                if(a.charAt(i)=='0'&&b.charAt(i)=='0')
                {
                    if(carry==1)
                    {
                        carry=0;
                        mychar='1';
                    }
                    else
                    {
                        carry = 0;
                        mychar='0';
                    }
                }
                output = Character.toString(mychar)+output;
            }
            
            if(carry==1)
            {
                output = "1" + output;
            }
        return output;
    }
}
