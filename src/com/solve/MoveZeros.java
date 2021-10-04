package com.solve;

import java.util.Arrays;
import java.util.Collections;

public class MoveZeros {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] nums = {-1,-3,-2,0};
	int k = 0;
	int tmp =0;
	//Arrays.sort(nums);
	for(int i =0;i<nums.length && k<(nums.length-1);i++) {
	    k = i+1;
	    if(nums[i] == 0) {
		while(k<=(nums.length-1)) {
		    if(nums[k]==0) k++;
		    else {
			tmp = nums[i];
			nums[i] = nums[k];
			nums[k]=tmp;
			break;
		    }
		 }
	    }
	}
    }
 }


