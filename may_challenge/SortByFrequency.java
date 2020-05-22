package may_challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortByFrequency {

	/*
	 Given a string, sort it in decreasing order based on the frequency of characters.
	 */
	
	public String frequencySort(String s) {
        
		StringBuilder builder = new StringBuilder();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char character : s.toCharArray()) {
			map.put(character, map.getOrDefault(character, 0) + 1);
		}
		
		List<Character>[] bucket = new List[s.length() + 1];
		
		for(char character : map.keySet()) {
			int frequency = map.get(character);
			
			if(bucket[frequency] == null) {
				bucket[frequency] = new ArrayList<Character>();
			}
			
			bucket[frequency].add(character);
		}
		
		for(int i = bucket.length - 1; i>=0; i--) {
			if(bucket[i] != null) {
				for(char c : bucket[i]) {
					for(int j = 0;j < map.get(c);j++) {
						builder.append(c);
					}
				}
			}
		}
        return builder.toString();
    }
}
