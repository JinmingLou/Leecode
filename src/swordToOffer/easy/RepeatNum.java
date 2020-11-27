package swordToOffer.easy;

public class RepeatNum {
    public int findRepeatNumber(int[] nums) {
        //思路跟TwoSum很像
        int j;
        for(int i = 0; i < nums.length; i++) {
            for(j = nums.length - 1; j > i; j--) {
                if(nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return 0;
    }
}
