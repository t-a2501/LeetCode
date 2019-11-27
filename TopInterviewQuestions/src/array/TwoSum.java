package array;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//Example:
//
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] result = new int[2];

        for(int i=0;i<nums.length;i++){
            for(int a=i+1;a<nums.length;a++){
                sum = nums[i] + nums[a];
                if(sum == target){
                    result[0] = i;
                    result[1] = a;
                    break;
                }
            }
        }
        return result;
    }
}
