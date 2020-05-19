package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	// Given an array of strings, group anagrams together.
	
//	public List<List<String>> groupAnagrams(String[] strs) {
//        
//        List<List<String>> result = new ArrayList<List<String>>();
//        
//        String first = strs[0];
//        List<String> list1 = new ArrayList<String>();
//        list1.add(first);
//        result.add(list1);
//        
//        for(int i = 1; i < strs.length; i++) {
//            String currVal = strs[i];
//            
//            boolean isAdded = false;
//            for(int j = 0 ; j < result.size(); j++) {
//                List<String> currList = result.get(j);
//                
//                if(isAnagram(currVal, currList.get(0))) {
//                    currList.add(currVal);
//                    isAdded = true;
//                }
//            }
//            
//            if(!isAdded) {
//                List<String> newList = new ArrayList<String>();
//                newList.add(currVal);
//                result.add(newList);
//            }
//            
//        }
//        return result;
//    }
//    
//    public boolean isAnagram(String s, String t) {
//        
//        if(s.length() != t.length()) return false;
//        int[] frequency = new int[26];
//        
//        for(int i=0;i < s.length(); i++) {
//            frequency[s.charAt(i) - 'a']++;
//            frequency[t.charAt(i) - 'a']--;
//        }
//        
//        for (int i = 0; i < 26; i++) {
//            if (frequency[i] != 0) return false;
//        }
//        return true;
//    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray()) ca[c - 'a']++;
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
