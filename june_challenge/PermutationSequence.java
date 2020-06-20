package june_challenge;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {

	/*
	 The set [1,2,3,...,n] contains a total of n! unique permutations.

	 By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

	 "123"
	 "132"
	 "213"
	 "231"
	 "312"
	 "321"
	 Given n and k, return the kth permutation sequence.

	 Note:

	 Given n will be between 1 and 9 inclusive.
	 Given k will be between 1 and n! inclusive.
	 */
	
	public String getPermutation(int n, int k) {
        int pos = 0;
    List<Integer> numbers = new ArrayList<>();
    int[] factorial = new int[n+1];
    StringBuilder sb = new StringBuilder();
    
    int sum = 1;
    factorial[0] = 1;
    for(int i=1; i<=n; i++){
        sum *= i;
        factorial[i] = sum;
    }
    
    for(int i=1; i<=n; i++){
        numbers.add(i);
    }
    
    k--;
    
    for(int i = 1; i <= n; i++){
        int index = k/factorial[n-i];
        sb.append(String.valueOf(numbers.get(index)));
        numbers.remove(index);
        k-=index*factorial[n-i];
    }
    
    return String.valueOf(sb);
    }
}
