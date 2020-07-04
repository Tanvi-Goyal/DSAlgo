package strings;

public class DetectCapital {

	public boolean detectCapitalUse(String word) {
        int countUpper = 0;
        
        for(char c : word.toCharArray()) {
        	if(Character.isUpperCase(c)) countUpper++;
        }
        
        if(countUpper == 1) return Character.isUpperCase(word.charAt(0));
        return countUpper == 0 || countUpper == word.length();
    }
}
