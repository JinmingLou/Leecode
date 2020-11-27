package algorithm.easy;

public class TwoSum {
    //借鉴了一下别人的思路
    public int[] twoSum(int[] nums, int target) {
        for (int x = 0; x < nums.length; x++) {
            for (int y = nums.length - 1; y > 0; y--) {
                if (nums[x] + nums[y] == target) {
                    if(x==y){
                        break;
                    }
                    int[] sz = {x, y};
                    return sz;
                }
            }
        }
        int[] yc = {'异', '常'};
        return yc;
    }
}
