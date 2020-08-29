package Stacks;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrefixToInfix pre = new PrefixToInfix();
		System.out.println(pre.prefixToInfix("*-A/BC-/AKL"));
		
		PrefixToPostfix prefixToPostfix = new PrefixToPostfix();
		System.out.println(prefixToPostfix.prefixToPostfix("*-A/BC-/AKL"));
		
		PostFixToPrefix postFixToPrefix = new PostFixToPrefix();
		System.out.println(postFixToPrefix.postFixToPrefix("ABC/-AK/L-*"));
		
		PostfixToInfix postfixToInfix = new PostfixToInfix();
		System.out.println(postfixToInfix.postfixToInfix("ab*c+"));
	}

}
