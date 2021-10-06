package com.solve;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
		String s = "dvdf";
		int st = 0;
		int start = 0;
		int end = 0;
		int curlen ,maxlen = 0;
		int i =1;
		Map<Character,Integer> myMap = new HashMap<Character,Integer>();
		if(!s.isEmpty()) myMap.put(s.charAt(0), 0);
		
		for( i =1;i<s.length();i++) {
		    if(!myMap.containsKey(s.charAt(i))){
			myMap.put(s.charAt(i), i);
		    }
		    else
		    {
			if (myMap.get(s.charAt(i)) >= st) {
			    curlen = i - st;
				if(curlen > maxlen) {
				    maxlen = curlen;
				    start =st;
				}
				st = myMap.get(s.charAt(i))+1;
			}
			myMap.replace(s.charAt(i), i); 
		    }
		}
		if(maxlen < i -st) {
		    maxlen = i-st;
		    start = st;
		}
		if(s.length() > 1) System.out.println(s.substring(start, start+maxlen));
		else if(s.length()==1) System.out.println(1);
		else  System.out.println(0);
		
    }

}
