package com.ouyang.demo;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
		
		System.out.println(outBuzzOrFizz(100));
		System.out.println(Stage2(10000));
	}
	
	
	private static int getNumber(int n) {
		int count = 0;
		while(Math.abs(n)%10>0|| n/10!=0){
			count ++;
			n=n/10;
		}
		return count;
	}

	public static List<String> outBuzzOrFizz(int n) {
	    List<String> list = new ArrayList<>(n);
	    
	    for(int i=1;i<=n;i++) {
	    	if( i % 3 == 0) {
	    		list.add("FIZZ");
	    	}else if( i % 5 == 0) {
	    		list.add("BUZZ");
	    	}else if( i % 3 == 0 && i % 5 == 0) {
	    		list.add("FIZZBUFF");
	    	}
	    	else{
	    		list.add(i + "");
	    	}
	    }
	 
	    return list;
	}
	
	public static List<String> Stage2(int n) {
	    List<String> list = new ArrayList<>(n);
	    
	    for(int i=1;i<=n;i++) {
	    	if(getNumber(i) == 2 && i % 3 == 0) {
	    		list.add("FIZZ");
	    	}else if(getNumber(i) == 2 && i % 5 == 0) {
	    		list.add("BUZZ");
	    	}else if( i % 3 == 0 && i % 5 == 0) {
	    		list.add("FIZZBUFF");
	    	
	    	}else if(getNumber(i) == 3){
	    		list.add("FIZZ");
	    	}else if(getNumber(i) == 5){
	    		list.add("BUZZ");
	    	}
	    	else{
	    		list.add(i + "");
	    	}
	    }
	 
	    return list;
	}
}
