package strings;

public class ImplementStr {

	/*
	 Implement strStr().

 	 Return the index of the first occurrence of needle in haystack, or -1 if needle is not 
 	 part of haystack.
 	 
 	 What should we return when needle is an empty string? This is a great question to ask 
 	 during an interview.

	 For the purpose of this problem, we will return 0 when needle is an empty string. 
	 This is consistent to C's strstr() and Java's indexOf().
	 */
	
	public int strStr(String haystack, String needle) {
        
        for(int i = 0 ; ; i++) {
            for(int j = 0; ; j++) {
                if(j == needle.length()) return i;
                if(i+j == haystack.length()) return -1;
                if(needle.charAt(j) != haystack.charAt(i+j)) break;
            } 
        }
    }
}
