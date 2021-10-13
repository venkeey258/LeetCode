package com.solve;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[][] grid = {{1,2,1,1,}};
	int m = grid.length;
	int n = grid[0].length;
	int noOranges=0;
	int rottenOranges =0;
	int min = -1;
	if( m==1 && n==1) {
            if(grid[m-1][n-1] ==1) System.out.println(min); 
            else System.out.println(0);
        } 
	boolean[][] visited = new boolean[m][n];
	Queue<Pair> myQ = new LinkedList<Pair>();
	for(int i =0;i<m;i++) {
	    for(int j=0;j<n;j++) {
		if(visited[i][j]==false) {
		    if(grid[i][j] != 0) {
			myQ.add(new Pair(i,j));
		    }
		    else {
			visited[i][j]=true;
			noOranges++;
		    }
		}
	while(!myQ.isEmpty()) {
	    int queueSize = myQ.size();
	    min++;
	    for(int k=0;k<queueSize;k++) {
		    Pair cods = myQ.poll();
		    int row = cods.x;
		    int col = cods.y;
		    
		    if(grid[cods.x][cods.y] ==2 && visited[row][col]==false) {
			visited[cods.x][cods.y]=true;
			rottenOranges++;
			if(isValid(row-1,col,m,n) && grid[row-1][col]==1 && visited[row-1][col]==false) {
			    grid[row-1][col] = 2;
			    myQ.add(new Pair(row-1,col));
			  
			}
			if(isValid(row+1,col,m,n) && grid[row+1][col]==1 && visited[row+1][col]==false) {
			    grid[row+1][col] = 2;
			    myQ.add(new Pair(row+1,col));
			    
			}
			if(isValid(row,col-1,m,n) && grid[row][col-1]==1 && visited[row][col-1]==false) {
			    grid[row][col-1]=2;
			    myQ.add(new Pair(row,col-1));
			   
			}
			if(isValid(row,col+1,m,n) && grid[row][col+1]==1 && visited[row][col+1]==false) {
			    grid[row][col+1]=2;
			    myQ.add(new Pair(row,col+1));
			}
		    }
		    else
		    {
			visited[row][col]=true;
		    }
		    }
		}
	    }
	}
	if( rottenOranges == m*n || noOranges == m*n) System.out.println(0);
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			if (grid[i][j] == 1) {
			    min=0;
			    break;
			}
		}
	}
	System.out.println(min);

    }
    
    private static boolean isValid(int i, int j, int m, int n) {
   	// TODO Auto-generated method stub
   	if( i<0 || j<0 || i>= m || j>= n   ) return false;
   	else return true;

       }

}
