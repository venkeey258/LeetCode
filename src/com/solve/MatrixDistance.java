package com.solve;

public class MatrixDistance {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
	
	int m = mat.length;
	int n = mat[0].length;
	boolean[][] visited = new boolean[m][n];
	for(int i=0;i<m;i++) {
	    for(int j=0;j<n;j++) {
		visited[i][j]=true;
		if(mat[i][j] !=0) {
		    mat[i][j]=calcDistance(mat,i,j,m,n,visited);
		}
		
	    }
	}
	for(int i1=0;i1<m;i1++) {
	    for(int j1=0;j1<n;j1++) {
		 System.out.println(mat[i1][j1]);
	    }
    }
    }

    private static int calcDistance(int[][] mat, int i, int j,int m,int n,boolean[][] visited) {
	// TODO Auto-generated method stub
		
	      if(isValid(i,j,m,n) && mat[i][j]!=0 && visited[i][j] == false) {
		  
		  return 1 + calcDistance(mat,i-1,j,m,n,visited)+calcDistance(mat,i+1,j,m,n,visited)
		  		+ calcDistance(mat,i,j-1,m,n,visited)+calcDistance(mat,i,j+1,m,n,visited);
	      }
	      
	    /*    if(isValid(i-1,j,m,n)) {
	           if(mat[i-1][j] == 0) return 0;
	           else Math.addExact(1, calcDistance(mat,i-1,j,m,n));
	        }
	        if(isValid(i+1,j,m,n)){ 
	            if(mat[i+1][j] == 0) return 0;
		    else Math.addExact(1, calcDistance(mat,i+1,j,m,n));
	        }
	         if(isValid(i,j-1,m,n)){ 
	            if(mat[i][j-1] == 0) return 0;
		    else Math.addExact(1, calcDistance(mat,i,j-1,m,n));
	        }
	        if(isValid(i,j+1,m,n)){ 
	            if(mat[i][j+1] == 0) return 0;
		    else Math.addExact(1, calcDistance(mat,i,j+1,m,n));
	        }
	        */
	        return 0;
	  
	
    }

    private static boolean isValid(int i, int j, int m, int n) {
	// TODO Auto-generated method stub
	if( i<0 || j<0 || i>= m || i>= n   ) return false;
	else return true;

    }
    
    

}
