package com.tomholmes.products.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WebPageLog
{
    private static Map<String, Integer> countPageAccess(TreeMap<String, String> map) {
        
        Map<String, Integer> mapCount = new HashMap<>();
        
        for (String key : map.keySet())
        {
            String visitedPages = map.get(key);
            
            System.out.println(key + ":" + visitedPages);
            
            
        }
        
        return mapCount;
        
    }
    
    public static void main(String[] args) {
        
        TreeMap<String, String> customerIdPageVisit = new TreeMap<>();
        customerIdPageVisit.put("id1", "ABCD");
        customerIdPageVisit.put("id2", "BCD");
        
        Map<String, Integer> mapCount = countPageAccess(customerIdPageVisit);
        
    }
    
}
