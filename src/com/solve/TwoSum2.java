package com.solve;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] nums = {2,7,11,15};
	int[] res = new int[2];
	int target = 9;
	Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();
	for(int i =0;i<nums.length;i++) {
	    myMap.putIfAbsent( target-nums[i],i);
	    if(myMap.containsKey(nums[i])) {
		res[0]=myMap.get(nums[i])+1;
		res[1]=i+1;
	    }
	}
	System.out.println("["+res[0]+","+res[1]+"]");
	
    }

}
