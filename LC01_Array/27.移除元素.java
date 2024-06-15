package LC01_Array;

/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

/**
* Run Successful Total Time Field
Website: https://leetcode.cn/problems/remove-element/description/
* Your Time | Error Description
* 1:  背模板吧
* 2:  
* 3:  
* 4:  
*/

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for (int p2 = 0; p2 < nums.length;p2++) {
            if(val != nums[p2])
                nums[count++]=nums[p2];
        }
        return count;
    }
}
// @lc code=end

