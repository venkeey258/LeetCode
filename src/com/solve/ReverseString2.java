package com.solve;

public class ReverseString2 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String s = "God Ding";
	String res = "";
	
	String[] str = s.split("\\s");
	for(int i =0;i<str.length;i++) {
	    str[i] = new StringBuilder(str[i]).reverse().toString(); 
	    res = res + str[i]+" ";
	}
	System.out.println(res.trim());
    }

}
