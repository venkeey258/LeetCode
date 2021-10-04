package com.solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Starting");
	int[] nums = {3,3};
	int[] res = new int[2];
	int target = 6;
	
	Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();
	for(int i =0;i<nums.length;i++) {
	    if(myMap.containsKey(nums[i])) {
		res[0]= i;
		res[1]=myMap.get(nums[i]);
		break;
	    }
	    myMap.put(Math.subtractExact(target, nums[i]), i);
	}
	
	System.out.println("["+res[0]+","+res[1]+"]");
    }

}
