package LC01_Array;
/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start

/**
* Run Successful Total Time Field
Website: https://leetcode.cn/problems/minimum-size-subarray-sum/
* Your Time | Error Description
* 1:  直接背模板吧
* 2:  
* 3:  
* 4:  
*/
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        int l = 0,r = 0;
        int sum = 0;
        for(;r<nums.length;r++){
            sum += nums[r];
            while(sum>=target){
                res = Math.min(res,r-l+1);
                sum -= nums[l++];
            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}
// @lc code=end

