package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {

	/*
	 Write a function that takes a string as input and reverse only the vowels of a string.
	 */
	
	public String reverseVowels(String s) {
        int i = 0;
	    int j = s.length() - 1;
	    
	    Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
	    char[] chArray = s.toCharArray();

	    while(i<j) {
	    	if(!set.contains(chArray[i])) {
			    i++;
		    } else if(!set.contains(chArray[j])) {
			    j--;
		    } else {
		    	char temp = chArray[i];
			    chArray[i] = s.charAt(j);
			    chArray[j] = temp;
			    i++; j--;
		    }
	    }
	    
	    return new String(chArray);
    }
}
