class Solution {
    public boolean isValid(String s) 
    {
        Stack <Character> stk=new Stack<>();
	    char l;
	    for(int i=0;i<s.length();i++)
	    {
	        l=s.charAt(i);
	        if(l=='['||l=='{'||l=='(')
	        {
	            stk.push(s.charAt(i));
	        }
	        if(l==']'||l=='}'||l==')')
	        {
	            if(stk.empty()==false)
	            {
	                if((stk.peek()=='[' && l==']')||(stk.peek()=='{' && l=='}')||(stk.peek()=='(' && l==')'))
	                {
	                    stk.pop();
	                }
	                else
	                stk.push(l);
	            }
	            else
	            stk.push(l);
	        }
	    }
	    if(stk.empty()==true)
	    return true;
	    else
	    return false;    
    }
}
