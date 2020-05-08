package may_challenge;

public class CheckIfStraightLine {

	/*
	 You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. 
	 Check if these points make a straight line in the XY plane.
	 */
	
	public boolean checkStraightLine(int[][] coordinates) {
        
        if(coordinates.length < 2) return false;
        if(coordinates.length == 2) return true;
        
        int x1 = coordinates[0][0]; int y1 = coordinates[0][1];
        int x2 = coordinates[1][0]; int y2 = coordinates[1][1];
        
        if(x2-x1 == 0) return false;
        int m = (y2-y1)/(x2-x1);
        int c = y1 - m*x1;
        
        for(int i=2;i<coordinates.length;i++) {
            if((m*coordinates[i][0] - coordinates[i][1] + c) !=0) return false;
        }
        return true;
    }
}
