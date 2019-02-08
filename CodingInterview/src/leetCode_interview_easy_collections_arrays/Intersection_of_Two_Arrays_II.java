package leetCode_interview_easy_collections_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Intersection_of_Two_Arrays_II {
	public static void main(String[] args) {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		intersect3(nums1, nums2);
	}
	public static int[] intersect(int[] nums1, int[] nums2) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int low_arr[], high_arr[];
		boolean flag = true;
		
		if(nums1.length < nums2.length) {
			low_arr = nums1.clone();
			high_arr = nums2.clone();
		}
		else {
			low_arr = nums2.clone();
			high_arr = nums1.clone();
		}
		for(int i = 0; i < low_arr.length; i++) {
			for(int j = 0; j < high_arr.length && flag; j++) {
				if(low_arr[i] == high_arr[j] && flag) {
					list.add(high_arr[j]);
					(high_arr[j]) = Integer.MAX_VALUE; 
					flag = false;
				}
			}
			flag = true;
		}
		int[] intersect = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			intersect[i] = list.get(i);
			System.out.println(intersect[i]);
		}
			
        return intersect;
    }
	public int[] intersect2(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length; i++)
        {
            if(map.containsKey(nums1[i])) {
            	map.put(nums1[i], map.get(nums1[i])+1);
            }	
            else {
            	map.put(nums1[i], 1);
            }	
            	
        }
    
        for(int i = 0; i < nums2.length; i++)
        {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0)
            {
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }
    
       int[] r = new int[result.size()];
       for(int i = 0; i < result.size(); i++)
       {
           r[i] = result.get(i);
       }
    
       return r;
    }
	public static int[] intersect3(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
		int maxSize = Math.min(nums1.length, nums2.length);
		int[] result = new int[maxSize];
		int size = 0;
	
		for (int i : nums1) {
			map.put(i, map.getOrDefault(i, 0) + 1);
			System.out.println(map.get(i));
		}
	
		for (int i : nums2) {
			if (map.getOrDefault(i, 0) > 0) {
				result[size++] = i;
				map.put(i, map.get(i) - 1);
			}
		}
	
		return Arrays.copyOf(result, size);
	}
}
