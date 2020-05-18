package may_challenge;

public class PermutationInString {

	/*
	 Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1.
	 In other words, one of the first string's permutations is the substring of the second string.
	 */
	
	public boolean checkInclusion(String s1, String s2) {
        
        int lenPattern = s1.length();
        int lenText = s2.length();
        
        if(lenPattern > lenText) return false;
        int[] frequency = new int[26];
        
        for(int i=0;i < lenPattern; i++) {
            frequency[s1.charAt(i) - 'a']++;
            frequency[s2.charAt(i) - 'a']--;
        }
        
        if(allZero(frequency)) return true;
        
        for (int i = lenPattern; i < lenText; i++) {
            frequency[s2.charAt(i) - 'a']--;
            frequency[s2.charAt(i - lenPattern) - 'a']++;
            if (allZero(frequency)) return true;
        }
        
        return false;
    }
    
    private boolean allZero(int[] frequency) {
        for (int i = 0; i < 26; i++) {
            if (frequency[i] != 0) return false;
        }
        return true;
    }
}
