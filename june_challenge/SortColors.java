package june_challenge;

public class SortColors {

	/*
	 Given an array with n objects colored red, white or blue, sort them in-place so 
	 that objects of the same color are adjacent, with the colors in the order red, white and blue.

	 Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

	 Note: You are not suppose to use the library's sort function for this problem.
	 */
	
	public void sortColors(int[] A) {
        if(A==null || A.length<2) return;
       int low = 0; 
       int high = A.length-1;
       for(int i = low; i<=high;) {
           if(A[i]==0) {
              // swap A[i] and A[low] and i,low both ++
              int temp = A[i];
              A[i] = A[low];
              A[low]=temp;
              i++;low++;
           }else if(A[i]==2) {
               //swap A[i] and A[high] and high--;
              int temp = A[i];
              A[i] = A[high];
              A[high]=temp;
              high--;
           }else {
               i++;
           }
       }
    }
}
