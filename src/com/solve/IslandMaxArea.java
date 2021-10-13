package com.solve;

import java.util.Stack;

public class IslandMaxArea {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[][] grid = { {0,1},{1,0} };
		               
	//int[][] grid = {{0,0,0,0,0,0,0,0}};
	int m = grid.length;
	int n = grid[0].length;
	boolean[][] visited = new boolean[m][n];
	Stack<Pair> myStack = new Stack<Pair>();
	int maxarea = 0;
	for(int i =0;i<m;i++) {
	    	for(int k =0;k<n;k++) {
	    	    	myStack.add(new Pair(i,k));
	    	    	int curarea = 0;
	    	    	while(!myStack.isEmpty()) {
	    	    	    	Pair cods = myStack.pop();
	    	    	    	if(!visited[cods.getX()][cods.getY()]) {
	    	    	    visited[cods.getX()][cods.getY()] = true;
	    	    	    if(grid[cods.getX()][cods.getY()] == 1) curarea++;
	    	    	    	if(isValid(m,n,cods.getX(),cods.getY()-1) && 
	    	    	    		visited[cods.getX()][cods.getY()-1]==false) {
	    	    	    	    	if(grid[cods.x][cods.y-1] ==1) myStack.push(new Pair(cods.x,cods.y-1));
	    	    	    	}
	    	    	    	if(isValid(m,n,cods.getX(),cods.getY()+1) && 
	    	    	    		visited[cods.getX()][cods.getY()+1]==false) {
	    	    	    	        if(grid[cods.x][cods.y+1] ==1) myStack.push(new Pair(cods.x,cods.y+1));
	    	    	    	}
	    	    	    	if(isValid(m,n,cods.getX()-1,cods.getY()) && 
	    	    	    		visited[cods.getX()-1][cods.getY()]==false) {
	    	    	    	    	if(grid[cods.x-1][cods.y] ==1) myStack.push(new Pair(cods.x-1,cods.y));
	    	    	    	}
	    	    	    	if(isValid(m,n,cods.getX()+1,cods.getY()) && 
	    	    	    		visited[cods.getX()+1][cods.getY()]==false) {
	    	    	    	        if(grid[cods.x+1][cods.y] ==1) myStack.push(new Pair(cods.x+1,cods.y));
	    	    	    	}
	    	    	    	}
	    	    	    	
	    	    	}
	               if(curarea > maxarea) maxarea = curarea;
	     }
	}
	System.out.println(maxarea); ;

    }
    
    private static boolean isValid(int m, int n, int x, int y) {
	// TODO Auto-generated method stub
	if( x < 0 || y < 0 || x >=m || y >=n ) return false;
	else return true;
    }

}
