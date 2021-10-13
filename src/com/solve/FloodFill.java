package com.solve;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int sr =8;
	int sc=0;
	int newcolor = 9;
	int[][] image = {{8,4,5,3,2,2,2,6,9,5},
				 {3,1,3,7,4,8,9,0,1,6},
				 {0,7,1,7,5,2,2,8,6,9},
				 {9,1,0,5,8,8,0,5,5,9},
				 {3,4,9,5,4,8,0,2,7,5},
				 {5,1,1,8,1,6,5,9,7,8},
				 {9,7,9,4,5,3,4,1,8,2},
				 {5,1,6,3,5,4,8,9,0,8},
				 {8,8,6,1,0,8,0,6,9,9},
				 {4,1,8,7,3,6,9,6,6,1}
				 };
	
	Queue<Pair> myQueue = new LinkedList<Pair>();
	myQueue.add(new Pair(sr,sc));
	int m = image.length;
	int n = image[0].length;
	boolean[][] visited = new boolean[m][n];
	
	int toreplace = image[sr][sc];
	
	
	while(!myQueue.isEmpty()) {
	         Pair cods = myQueue.poll();
	         visited[cods.getX()][cods.getY()]=true;
	         sr = cods.getX();
	         sc=cods.getY();
	         image[sr][sc]= newcolor;
	         if(isValid(m,n,sr,sc-1) && visited[sr][sc-1] == false) {
	             if(image[sr][sc-1] == toreplace ) {
		             myQueue.add(new Pair(sr,sc-1));
		         }
	         }
	         if(isValid(m,n,sr,sc+1) && visited[sr][sc+1] == false) {
	             if(image[sr][sc+1] == toreplace){
	        	 myQueue.add(new Pair(sr,sc+1));
	             } 
	         }
	         if(isValid(m,n,sr-1,sc) && visited[sr-1][sc] == false) {
	             if(image[sr-1][sc] == toreplace){
	        	 myQueue.add(new Pair(sr-1,sc));
	             }
	         }
	         if(isValid(m,n,sr+1,sc) && visited[sr+1][sc] == false) {
	             if(image[sr+1][sc] == toreplace){
	        	 myQueue.add(new Pair(sr+1,sc));
	             }
	         }
	         
	}
	for(int i =0;i<m;i++) {
	    for(int j=0;j<n;j++) {
		System.out.printf("%d ",image[i][j]);
	    }
	    System.out.println();
	}
	
	
    }

    private static boolean isValid(int m, int n, int x, int y) {
	// TODO Auto-generated method stub
	if( x < 0 || y < 0 || x >=m || y >=n ) return false;
	else return true;
    }

}
