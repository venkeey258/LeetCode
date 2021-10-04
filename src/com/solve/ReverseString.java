package com.solve;

public class ReverseString {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	char[] str = {'H','a','n','n','a','h'};
	int k = 0;
	for(int i = str.length-1;i>=0 ;i--) {
	  
	    Character temp = str[k];
	    str[k]=str[i];
	    str[i]=temp;
	    k++;
	    
	    if(i == k) break;
	}
	for(int i =0;i<str.length;i++) {
	    System.out.println(str[i]);
	}
	
    }

}
