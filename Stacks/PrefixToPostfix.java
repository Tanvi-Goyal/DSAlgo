package Stacks;

import java.util.Stack;

public class PrefixToPostfix {

	public String prefixToPostfix(String prefix) {
		Stack<String> stack = new Stack<>();
		
		for(int i = prefix.length() - 1; i >= 0; i--) {
			char currentChar = prefix.charAt(i);
			
			if(!isOperator(currentChar)) {
				stack.push(currentChar + "");
			} else {
				String operand1 = stack.pop();
				String operand2 = stack.pop();
				
				String expression = operand1 + operand2 + currentChar ;
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
