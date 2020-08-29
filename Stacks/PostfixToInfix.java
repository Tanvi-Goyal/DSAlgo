package Stacks;

import java.util.Stack;

public class PostfixToInfix {
	
	public String postfixToInfix(String postfix) {
		Stack<String> stack = new Stack<>();
		
		for(int i = 0 ; i < postfix.length(); i++) {
			char currentChar = postfix.charAt(i);
			if(!isOperator(currentChar)) {
				stack.push(currentChar + "");
			} else {
				String operand1 = stack.pop();
				String operand2 = stack.pop();
				
				String exp = '(' + operand2 + currentChar + operand1 + ')';
				stack.push(exp);
			}
			
		}
		
		return stack.peek();
	}

	private boolean isOperator(char ch) {
		if(ch == '^' || ch == '/' || ch == '*' || ch == '-' || ch == '+') return true;
		return false;
	}
}
