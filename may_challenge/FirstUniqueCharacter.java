package may_challenge;

public class FirstUniqueCharacter {

	/*
	 Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
	 */
	
	public int firstUniqChar(String s) {
        int[] frequency = new int[26];
        char[] charArray = s.toCharArray();
        for(char c: charArray) {
            frequency[c - 'a']++;
        }
        
        for(int i=0;i<charArray.length;i++) {
            if(frequency[charArray[i] - 'a'] == 1) return i;
        }
        
        return -1;
    }
}
