package strings;

public class App {

	public static void main(String[] args) {

		RomanToInt romanToInt = new RomanToInt();
		System.out.println(romanToInt.romanToInt("MCMXCIV"));
		
		ValidPalindrome validPalindrome = new ValidPalindrome();
		System.out.println(validPalindrome.isPalindrome("ssadbajbfbafbadjbqwdbqwwqfaw"));
		
		CountAndSay countAndSay = new CountAndSay();
		System.out.println(countAndSay.countAndSay(4));
	}

}
