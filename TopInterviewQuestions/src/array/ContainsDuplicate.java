package array;

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