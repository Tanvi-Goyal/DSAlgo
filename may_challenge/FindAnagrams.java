package may_challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAnagrams {

	/*
	 Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
	 Strings consists of lowercase English letters only and the length of both strings s and p 
	 will not be larger than 20,100.

	 The order of output does not matter.
	 */
	
	 public List<Integer> findAnagrams(String s, String p) {
		 
		 List<Integer> result = new ArrayList<Integer>();
	        int lenText = s.length();
	        int lenPattern = p.length();
	        
	        if(lenPattern > lenText) return new ArrayList<Integer>();
	        
	        int[] frequency = new int[26];
	        
	        for(int i=0;i < lenPattern; i++) {
	            frequency[p.charAt(i) - 'a']++;
	            frequency[s.charAt(i) - 'a']--;
	        }
	        
	        if(allZero(frequency)) result.add(0);
	        
	        for (int i = lenPattern; i < lenText; i++) {
	            frequency[s.charAt(i) - 'a']--;
	            frequency[s.charAt(i - lenPattern) - 'a']++;
	            if (allZero(frequency)) result.add( i - lenPattern + 1);
	        }
	        
	        return result;
	      
	 }
	 
	 private boolean allZero(int[] frequency) {
	        for (int i = 0; i < 26; i++) {
	            if (frequency[i] != 0) return false;
	        }
	        return true;
	    }
}
