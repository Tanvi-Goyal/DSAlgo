package may_challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PossibleBipartition {

	/*
	 Given a set of N people (numbered 1, 2, ..., N), we would like to split everyone 
	 into two groups of any size.

	 Each person may dislike some other people, and they should not go into the same group. 

	 Formally, if dislikes[i] = [a, b], it means it is not allowed to put the people 
	 numbered a and b into the same group.

	 Return true if and only if it is possible to split everyone into two groups in this way.
 
	 */
	
	public boolean possibleBipartition(int N, int[][] dislikes) {
		
		int[] color = new int[N+1];
		
		List<Integer>[] graph = new List[N+1];
		for(int i = 0; i <= N; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		
		for(int[] v : dislikes) {
			graph[v[0]].add(v[1]);
			graph[v[1]].add(v[0]);
		}
		
		for(int i = 1; i <= N; i++) {
			if(color[i] == 0) {
				LinkedList<Integer> queue = new LinkedList<>();
				queue.add(i);
				color[i] = 1;
				
				while(queue.size() != 0) {
					int top = queue.removeFirst();
					for(int value : graph[top]) {
						if(color[value] == color[top]) return false;
						if(color[value] == 0) {
							color[value] = -color[top];
							queue.add(value);
						}
					}
				}
				
			}
		}
        return true; 
    }
}
