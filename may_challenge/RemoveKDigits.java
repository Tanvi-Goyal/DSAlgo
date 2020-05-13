package may_challenge;

import java.util.Stack;

public class RemoveKDigits {

	/*
	 Given a non-negative integer num represented as a string, remove k digits from the number so 
	 that the new number is the smallest possible.

	 Note:
	 The length of num is less than 10002 and will be ≥ k.
	 The given num does not contain any leading zero.
	 */
	
	public String removeKdigits(String num, int k) {
        if(num.length() == k) return "0";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i< num.length();i++) {
             while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(i)){
                stack.pop();
                k--;
            }
            
            stack.push(num.charAt(i));
        }
        
        while(k>0) {
            stack.pop();
            k--;
        }
        
        StringBuilder builder = new StringBuilder();
        while(!stack.isEmpty()) builder.append(stack.pop());
        builder.reverse();
        
        while(builder.length() > 1 && builder.charAt(0) == '0') builder.deleteCharAt(0);
        return builder.toString();
    }
}
