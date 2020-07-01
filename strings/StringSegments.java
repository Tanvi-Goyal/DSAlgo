package strings;

public class StringSegments {

	/*
	 Count the number of segments in a string, where a segment is defined to be a 
	 contiguous sequence of non-space characters.

	 Please note that the string does not contain any non-printable characters.
	 */
	
	public int countSegments(String s) {
        int segmentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' ') {
                segmentCount++;
            }
        }

        return segmentCount;
    }
}
