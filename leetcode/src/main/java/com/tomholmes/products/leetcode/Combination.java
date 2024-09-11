package com.tomholmes.products.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {
	
	private static List<List<Character>> stringList = null;
	
	static void comboProcess(List<List<Character>> lists, List<String> result, int depth, String current) {
	    if (depth == lists.size()) {
	        result.add(current);
	        System.out.println("current = " + current);
	        return;
	    }

	    for (int i = 0; i < lists.get(depth).size(); i++) {
	    	comboProcess(lists, result, depth + 1, current + lists.get(depth).get(i));
	    }
	}
	
	private static void comboStart(int[] arrayIndexes) {
		
		List<List<Character>> lists = new ArrayList<>();
		
		for(int i = 0 ; i <= arrayIndexes.length-1 ; i++) {
			lists.add(stringList.get(arrayIndexes[i]));
		}
		
		List<String> result = new ArrayList<>();
		comboProcess(lists, result, 0, "");
	}
	
	public static final void main(String args[]) {
		
		stringList = new ArrayList<>();
		stringList.add(null);
		stringList.add(null);

		Character[] temp2 = { 'a', 'b', 'c' };
		stringList.add(Arrays.asList(temp2));

		Character[] temp3 = { 'd', 'e', 'f' };
		stringList.add(Arrays.asList(temp3));

		Character[] temp4 = { 'g', 'h', 'i' };
		stringList.add(Arrays.asList(temp4));
		
		Character[] temp5 = { 'j', 'k', 'l' };
		stringList.add(Arrays.asList(temp5));
		
		int[] comboIndexes = {2,3,2};
		comboStart(comboIndexes);
	}
	

}
