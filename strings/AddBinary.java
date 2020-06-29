package strings;

public class AddBinary {

	/*
	 Given two binary strings, return their sum (also a binary string).

	 The input strings are both non-empty and contains only characters 1 or 0
	 */
	
	public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
	    int i = a.length() - 1;
	    int j = b.length() - 1;
	    int carry = 0;
	
	    while(i>=0 || j>=0) {
		    int sum = carry;
		    if(j >= 0) sum+=b.charAt(j--) - '0';
            if(i >= 0) sum+=a.charAt(i--) - '0';

            res.append(sum % 2);
            carry = sum / 2;
	    }

	    if(carry != 0) res.append(carry);
	    return res.reverse().toString();
    }
}
