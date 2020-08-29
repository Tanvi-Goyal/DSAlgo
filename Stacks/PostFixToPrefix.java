package Stacks;

import java.util.Stack;

public class PostFixToPrefix {

	public String postFixToPrefix(String postfix) {
		Stack<String> stack = new Stack<>();
		
		for(int i = 0 ; i < postfix.length(); i++) {
			
			char currentChar = postfix.charAt(i);
			if(!isOperator(currentChar)) {
				stack.push(currentChar + "");
			} else {
				String operand1 = stack.pop();
				String operand2 = stack.pop();
				
				String expression = currentChar + operand2 + operand1;
				stack.push(expression);
			}
			
		}
		return stack.peek();
	}
	
	private boolean isOperator(char ch) {
		if(ch == '^' || ch == '/' || ch == '*' || ch == '-' || ch == '+') return true;
		return false;
	}
}
