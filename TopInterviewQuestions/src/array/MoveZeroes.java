package array;

import java.util.ArrayList;

//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//Example:
//
//Input: [0,1,0,3,12]
//Output: [1,3,12,0,0]
//Note:
//
//You must do this in-place without making a copy of the array.
//Minimize the total number of operations.

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> temp   = new ArrayList<Integer>();


        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0){
                temp.add(nums[i]);
            }else{
                result.add(nums[i]);
            }

            if(i == nums.length - 1){
                for(int a=0;a<temp.size();a++){
                    result.add(temp.get(a));
                }
            }
        }

        for(int i=0;i<result.size();i++){
            nums[i] = result.get(i);
        }
    }
}
