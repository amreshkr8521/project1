package com.bridgelabz.DataStructure;

import java.util.Scanner;

public class BalancedParentheses {
	static Scanner scanner=new Scanner(System.in);
	 public static boolean balancedParenthesis(char[] exp,int length)
	    {
	    	//object of Stack class 
	    	Stack st = new Stack();
	    	//logic to check parenthesis in expression
	    	for(int i = 0;i<length;i++)
	    	{
	    		if(exp[i] == '{' || exp[i] == '(' || exp[i] == '[' ) 
	    			st.push(exp[i]);
	    		if(exp[i] == '}' || exp[i] == ')' || exp[i] == ']') 
	    		{
	    			if(st.isEmpty())
	    			{
	    				return false;
	    			}
	    			else
	    			{
	    				if(!isMatchingPair(st.pop(),exp[i]))
	    					return false;
	    			}	
	    		}
	    	}
			if(st.isEmpty())
				return true;
			else
				return false;
	    }
	    /**
	     * define static function isMatchingPair() to match the opened and closed parenthesis to make pairs
	     * @param ch1 ==> char
	     * @param ch2 ==> char
	     * @return boolean
	     */
	    public static boolean isMatchingPair(char ch1, char ch2) 
	    { 
	       if (ch1 == '(' && ch2 == ')') 
	         return true; 
	       else if (ch1 == '{' && ch2 == '}') 
	         return true; 
	       else if (ch1 == '[' && ch2 == ']') 
	         return true; 
	       else
	         return false; 
	    }    
		
	    //Main method
		public static void main(String[] args) {
			System.out.println("Enter the expression : ");
			char []exp = scanner.nextLine().toCharArray();
			int length = exp.length;
		
			//checking the parenthesis is balanced or not
			if(balancedParenthesis(exp,length))
				System.out.println("Balanced");
			else
				System.out.println("Unbalanced");	
		}
	
}

