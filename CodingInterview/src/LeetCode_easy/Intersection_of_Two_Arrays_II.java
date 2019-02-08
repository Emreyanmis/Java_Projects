package LeetCode_easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class Intersection_of_Two_Arrays_II {
	
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,2,1};
		int[] arr2 = {2,2};
		System.out.println(intersect(arr1, arr2));
	}
    public static Integer[] intersect(int[] nums1, int[] nums2) {
    	Set<Integer> set1 = new HashSet<Integer>();
    	Set<Integer> set2 = new HashSet<Integer>();
    	Set<Integer> set3 = new HashSet<Integer>();
    	
    	Set<Integer> setBiggest = new HashSet<Integer>();
    	
    	for(int i: nums1) {
    		set1.add(i);
    	}
    	for(int i: nums2) {
    		set2.add(i);
    	}
    	
        
    	int lowest = (set1.size() < set2.size()) ? set1.size(): set2.size();
    	Integer[] arr_low;
    	List<Integer> arr_big = new ArrayList<Integer>();
 
    	if(set1.size() < set2.size()) {
    		arr_low = set1.toArray(new Integer[set1.size()]);
    		for(int i: set2)
    			arr_big.add(i);
    	}	
    	else{
    		arr_low = set2.toArray(new Integer[set2.size()]);
    		for(int i: set1)
    			arr_big.add(i);
    	}	
    	
    	List<Integer> lList = new ArrayList<Integer>();
   
    	
    	for(int i = 0; i < lowest; i++) {
    		if(arr_big.contains(arr_low[i]))
    			set3.add(arr_low[i]);
    	}
    	Integer[] ar1 = set3.toArray(new Integer[set3.size()]);
 
		return ar1;
        
    }

}
