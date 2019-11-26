package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given two arrays, write a function to compute their intersection.
//
//Example 1:
//
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2,2]
//Example 2:
//
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [4,9]
//Note:
//
//Each element in the result should appear as many times as it shows in both arrays.
//The result can be in any order.

public class IntersectionofTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            if (map.containsKey(num)) {
                int freq = map.get(num);
                map.put(num, freq + 1);
            } else {
                map.put(num, 1);
            }
        }

        List<Integer> temp = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                temp.add(num);
                int freq = map.get(num);
                freq--;
                map.put(num, freq);
            }
        }

        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }

        return result;
    }
}
