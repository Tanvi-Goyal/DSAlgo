package may_challenge;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointToOrigin {

	/*
	 We have a list of points on the plane.  Find the K closest points to the origin (0, 0).

	 (Here, the distance between two points on a plane is the Euclidean distance.)

 	 You may return the answer in any order.  The answer is guaranteed to be unique 
 	 (except for the order that it is in.)
	 */
	
	public int[][] kClosest(int[][] points, int K) {
        
		int[][] res = new int[K][];
		PriorityQueue<int[]> heap = new PriorityQueue<int[]>(new Comparator<int[]>() {

			@Override
			public int compare(int[] left, int[] right) {
				return getDistance(right) - getDistance(left);
			}
			
		});
		
		for(int[] point : points) {
			heap.add(point);
			if(heap.size() > K) {
				heap.remove();
			}
		}
		
		while(K > 0) {
			res[--K] = heap.poll();
		}

		return res;
    }

	protected int getDistance(int[] point) {
		return point[0] * point[0] + point[1] * point[1];
	}
}
