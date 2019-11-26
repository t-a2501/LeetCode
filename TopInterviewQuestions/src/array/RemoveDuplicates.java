package array;

import java.util.ArrayList;
import java.util.List;

//Given an array of integers, find if the array contains any duplicates.
//
//Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
//
//Example 1:
//
//Input: [1,2,3,1]
//Output: true
//Example 2:
//
//Input: [1,2,3,4]
//Output: false
//Example 3:
//
//Input: [1,1,1,3,3,4,3,2,4,2]
//Output: true

public class RemoveDuplicates {

	public static void main(String arg[]) {
		int nums[] = {1,1,2};

		int len = removeDuplicates(nums);

		// any modification to nums in your function would be known by the caller.
		// using the length returned by your function, it prints the first len elements.
		for (int i = 0; i < len; i++) {
		    System.out.print(nums[i]);
		}
	}

    public static int removeDuplicates(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
    }

}
