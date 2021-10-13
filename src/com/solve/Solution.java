package com.solve;

public class Solution {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
      //  int[][] grid  = {{0,1},{1,0}};
       // System.out.println(maxAreaOfIsland(grid));
	String x = "new";
	if("new".equals(x)) {
	    System.out.println("works");
	}
    }
    
    public static int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
    for(int i = 0; i < grid.length; i++){
        for(int j = 0; j < grid[0].length; j++){
            maxArea = Math.max(maxArea, areaOfIsland(grid, i, j));
        }
    }
    return maxArea;
    }
    public static int areaOfIsland(int[][] grid, int i, int j) {
    if(i < 0 || i >= grid.length) return 0;
    if(j < 0 || j >= grid[0].length) return 0;

    if(grid[i][j] == 1) {
        grid[i][j] = 0;
        return 1 + areaOfIsland(grid, i+1, j) + areaOfIsland(grid, i-1, j) + areaOfIsland(grid, i, j+1) + areaOfIsland(grid, i, j-1);
    }
    return 0;
}

}
