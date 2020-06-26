package strings;

import java.util.Stack;

public class ValidParenthesis {

	/*
	 Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
	 determine if the input string is valid.

	 An input string is valid if:

	 Open brackets must be closed by the same type of brackets.
	 Open brackets must be closed in the correct order.
	 Note that an empty string is also considered valid.
	 */
	
	public boolean isValid(String input) {
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < input.length(); i++) {
	        char c = input.charAt(i);
	        if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
	        } else if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
	        } else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
	        } else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
	        } else return false;
        }
                      
        return stack.isEmpty();
    }
}
