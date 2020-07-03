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
		
		AddBinary addBinary = new AddBinary();
		System.out.println(addBinary.addBinary("00110", "100"));
		
		ReverseVowels reverseVowels = new ReverseVowels();
		System.out.println(reverseVowels.reverseVowels("leetcode"));
		
		AddStrings addStrings = new AddStrings();
		System.out.println(addStrings.addStrings("123", "34"));
		
		StringSegments stringSegments = new StringSegments();
		System.out.println(stringSegments.countSegments("Hello, my name is John"));
		
		StringCompression stringCompression = new StringCompression();
		System.out.println(stringCompression.compress(new char[] {'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
		System.out.println(stringCompression.compress(new char[] {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'b'}));
		
		RepeatedSubstringPattern RepeatedSubstringPattern = new RepeatedSubstringPattern();
		System.out.println(RepeatedSubstringPattern.repeatedSubstringPattern("abcabcabcabc"));
	}

}
