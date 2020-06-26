package strings;

public class App {

	public static void main(String[] args) {

		RomanToInt romanToInt = new RomanToInt();
		System.out.println(romanToInt.romanToInt("MCMXCIV"));
		
		ValidPalindrome validPalindrome = new ValidPalindrome();
		System.out.println(validPalindrome.isPalindrome("ssadbajbfbafbadjbqwdbqwwqfaw"));
		
		CountAndSay countAndSay = new CountAndSay();
		System.out.println(countAndSay.countAndSay(4));
		
		ImplementStr implementStr = new ImplementStr();
		System.out.println(implementStr.strStr("hello", "ll"));
		
		LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
		System.out.println(longestCommonPrefix.longestCommonPrefix(
				new String[] {"flower","flow","flight"}
				));
		
		ValidParenthesis validParenthesis = new ValidParenthesis();
		System.out.println(validParenthesis.isValid("([)]"));
		
		LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
		System.out.println(lengthOfLastWord.lengthOfLastWord("aa"));
	}

}
