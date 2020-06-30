package strings;

public class AddStrings {

	/*
	 Given two non-negative integers num1 and num2 represented as string, 
	 return the sum of num1 and num2.

	 Note:

	 The length of both num1 and num2 is < 5100.
	 Both num1 and num2 contains only digits 0-9.
	 Both num1 and num2 does not contain any leading zero.
	 You must not use any built-in BigInteger library or convert the inputs to integer directly.
	 */
	
	public String addStrings(String a, String b) {
        StringBuilder res = new StringBuilder();
	    int i = a.length() -1;
	    int j = b.length() -1;
	    int carry = 0;
	
	    while(i>=0 || j>=0) {
		    int sum = carry;
		    if(j >= 0) sum+=b.charAt(j--) - '0';
            if(i >= 0) sum+=a.charAt(i--) - '0';

            res.append(sum % 10);
            carry = sum / 10;
	    }

	    if(carry != 0) res.append(carry);
	    return res.reverse().toString();
    }
}
