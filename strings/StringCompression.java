package strings;

public class StringCompression {

	 public int compress(char[] chars) {
		 int index = 0;
	     int ans = 0;
	     while(index < chars.length) {
			int count = 0;
			char ch = chars[index];
			while(index < chars.length && chars[index] == ch) {
				count++;
				index++;
		    }
	            
	        chars[ans++] = ch;
	                
			if(count != 1)
	           for(char c : Integer.toString(count).toCharArray()) 
	              chars[ans++] = c;
			}
	     
			return ans;
	 }
}
