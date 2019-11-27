package array;

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

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i < nums.length;i++) {
            for(int a = i+1;a < nums.length;a++){
                if(nums[i] == nums[a]){
                    return true;
                }
            }
        }
        return false;
    }
}