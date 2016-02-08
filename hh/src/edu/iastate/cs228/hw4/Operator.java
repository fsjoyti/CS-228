package edu.iastate.cs228.hw4;

/**
 *  
 * @author Fahmida
 *
 */

/**
 * 
 * This class represents operators '+', '-', '*', '/', '%', '^', '(', and ')'.  
 * Every operator has an input precedence, a stack precedence, and a rank, as specified 
 * in the table below. 
 * 
 *   operator       input precedence        stack precedence       rank
 *   ___________________________________________________________________ 
 *   +  -                   1                        1              -1
 *   *  /  %                2                        2              -1
 *   ^                      4                        3              -1
 *   (                      5                       -1               0
 *   )                      0                        0               0 
 *
 */


import java.lang.Comparable; 

public class Operator implements Comparable<Operator>
{
	public char operator; 	      // operator
	
	private	int inputPrecedence;  // input precedence of operator in the range [0, 5]
	private	int stackPrecedence;  // stack precedence of operator in the range [-1, 3]

	/**
	 * Constructor 
	 * @param ch
	 */
	public Operator(char ch) 
	{
		// TODO
		operator = ch;
		switch(ch) {
		case '+':
			inputPrecedence = 1;
			stackPrecedence = 1;
			break;
		case '-':
			inputPrecedence = 1;
			stackPrecedence = 1;
			break;
		case '*':
			inputPrecedence = 2;
			stackPrecedence = 2;
			break;
		case '/':
			inputPrecedence = 2;
			stackPrecedence = 2;
			break;
		case '%':
			inputPrecedence = 2;
			stackPrecedence = 2;
			break;
		case '^':
			inputPrecedence = 4;
			stackPrecedence = 3;
			break;
		case '(':
			inputPrecedence = 5;
			stackPrecedence = -1;
			break;
		
		case ')':
			inputPrecedence = 0;
			stackPrecedence = 0;
			break;
		}
		
			
	}
	

	/**
	 * Returns 1, 0, -1 if the stackPrecedence of this operator is greater than, equal to, 
	 * or less than the inputPrecedence of the parameter operator op. It's for determining 
	 * whether this operator on the stack should be output before pushing op onto the stack.
	 */
	@Override
	public int compareTo(Operator op)
	{ 	
		// TODO
		if (this.stackPrecedence==op.inputPrecedence)return 0;
		else if (this.stackPrecedence>op.inputPrecedence)return 1;
		else return -1;
		
	} 


	/**
	 * 
	 * @return char Returns the operator character.  
	 */
	public char getOp()   
	{
	   return operator; 
	}
}
