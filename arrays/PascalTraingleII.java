package arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTraingleII {

	/*
	 Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
	 Note that the row index starts from 0.
	 */
	
	public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<=rowIndex;i++) {
            list.add(1);
            for(int j=i-1;j>0;j--) {
                list.set(j, list.get(j-1) + list.get(j));
            }
        }
        
        return list;
    }
}
