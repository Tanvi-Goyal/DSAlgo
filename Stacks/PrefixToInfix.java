package Stacks;

import java.util.Stack;

public class PrefixToInfix {

	public String prefixToInfix(String prefix) {
		Stack<String> stack = new Stack<>();
		
		for(int i = prefix.length() - 1 ; i >= 0; i--) {
			char currentChar = prefix.charAt(i);
			
			if(!isOperator(currentChar)) {
				stack.push(currentChar + "");
			} else {
				String operand1 = stack.pop();
				String operand2 = stack.pop();
				
				String operation = '(' + operand1 + currentChar + operand2 + ')';
				stack.push(operation);
			}
		}
		
		return stack.peek();
	}

	private boolean isOperator(char ch) {
		if(ch == '^' || ch == '/' || ch == '*' || ch == '-' || ch == '+') return true;
		return false;
	}
}
