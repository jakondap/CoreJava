package com.test;

/**
 * @author Karti
 * finding the maximum distance from bottom left.
 * We can move from left to right and top only.
 *
 */
public class GraphOptimalPath {
	private static int total = 0;
	private static int distanceArr[][] = {
			{0,10, 1, 1, 5},
			{0,1,1,0,0},
			{1,0,0,10,0 },
			{0,1,1,0,10}
	};
	public static void main(String[] args) {
		 optimalPath(distanceArr, 3, 0);
		 System.out.println("Total "+total);
	}
	private static void  optimalPath(int[][] distanceArr, int row, int col) {
		int top = 0;
		int right = 0;
		System.out.println("Row "+ row + "col "+col);
		
		if((distanceArr == null ||row < 0 || col >distanceArr[row].length)) {
			return;
		}else if(row == 0 &&  col >distanceArr[row].length){
			return;
		}else {
			total = total + distanceArr[row][col];
			if(col < distanceArr[row].length - 1) {
				right = distanceArr[row][col+1];
			}else {				
				if(row -1 >0)
					right = distanceArr[row -1][0];
			}
			if(row >0) {
				top = distanceArr[row-1 ][col];
			}
			//decide which direction to go now
			if(top > right) {
				row = row - 1;
			}else {
				col = col +1;
				if(col >= distanceArr[row].length) {
					col = 0;
					row = row -1;
				}
			}
		}
		optimalPath(distanceArr, row, col);
	}
  
}
