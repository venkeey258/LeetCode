package com.solve;

import java.util.Arrays;

public class StringPermutations {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String s1 = "abc";
	String s2 = "abbcaw";
	boolean result = false;
	for(int i =0,k = s1.length();i+k<=s2.length();i++) {
	    char[] c1 = s1.toCharArray();
	     char[] c2 = s2.substring(i,i+k).toCharArray();
	     Arrays.parallelSort(c1);
	     Arrays.parallelSort(c2);
	    if(Arrays.equals(c1, c2)) {
		System.out.println(true);
		break;
	    }
	  }
	   System.out.println(false);
    }

}
