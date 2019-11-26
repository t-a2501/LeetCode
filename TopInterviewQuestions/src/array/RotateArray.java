package array;

//Given an array, rotate the array to the right by k steps, where k is non-negative.
//
//Example 1:
//
//Input: [1,2,3,4,5,6,7] and k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
//Example 2:
//
//Input: [-1,-100,3,99] and k = 2
//Output: [3,99,-1,-100]
//Explanation:
//rotate 1 steps to the right: [99,-1,-100,3]
//rotate 2 steps to the right: [3,99,-1,-100]

public class RotateArray {
    public void rotate(int[] nums, int k) {
        if(k > nums.length){
            k=k%nums.length;
        }

        int[] result = new int[nums.length];

        for(int i=0; i < k; i++){
            result[i] = nums[nums.length-k+i];
        }

        int j=0;
        for(int i=k; i<nums.length; i++){
            result[i] = nums[j];
            j++;
        }

        System.arraycopy( result, 0, nums, 0, nums.length );
    }
}
