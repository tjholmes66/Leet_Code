package com.tomholmes.products.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Write the code to find the total occurrence count of each element in this list:
// List of Strings is "AMD", "NVDA", "MU", "INTC", "NVDA", "ADBE", "AMD", "INTC", "NVDA"

public class InterviewTwo {
	
	public static final void main(String args[]) {
		
		List<String> words = Arrays.asList("AMD", "NVDA", "MU", "INTC", "NVDA", "ADBE", "AMD", "INTC", "NVDA");
		
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(int i = 0 ; i < words.size() ; i++) {
			
			// System.out.println("i=" + i + ", words[i]=" + words.get(i));
			
			String key =  words.get(i);
			//System.out.println("key=" + key);
			
			
			if( map.containsKey(key) ) {
				
				// System.out.println("here");
				int count = map.get(key);
				map.put(key, ++count);
				
			} else {
				
				map.put(key, 1);
				
			}
			
			
		}
		
		for (String key : map.keySet()) {
		    System.out.println("key=" + key + ", count=" + map.get(key));
		}
		
	}

}
