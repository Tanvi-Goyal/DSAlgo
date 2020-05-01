package arrays;

import java.util.HashMap;

public class CheckIfNandDoubleExist {

	/*
	 Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

	 More formally check if there exists two indices i and j such that :
	 i != j
	 0 <= i, j < arr.length
	 arr[i] == 2 * arr[j]
	 */
	
	public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i =0; i<arr.length; i++) {
            if(map.containsKey(arr[i]*2)) return true;
            if(arr[i] %2 == 0) {
                if(map.containsKey(arr[i]/2)) return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }
}
