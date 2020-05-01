package arrays;

public class DuplicateZeroes {

	/*
	Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
	Note that elements beyond the length of the original array are not written.
	Do the above modifications to the input array in place, do not return anything from your function.
	*/
	
	public void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length = arr.length -1 ;
        
        for(int left = 0; left <= length - possibleDups; left++) {
            if(arr[left] == 0) {
                if(left == length - possibleDups) {
                    arr[length] = 0;
                    length-=1;
                    break;
                }
                possibleDups++;
            }
        }
        
        int last = length - possibleDups;
        for(int i = last; i>= 0; i--) {
            if(arr[i] == 0) {
                arr[i+ possibleDups] = 0;
                possibleDups--;
                arr[i+ possibleDups] = 0;
            } else {
                arr[i+ possibleDups] = arr[i];
            }
        }
    }
}
