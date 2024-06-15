package LC01_Array;

/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

/**
* Run Successful Total Time Field
Website: https://leetcode.cn/problems/squares-of-a-sorted-array/description/
* Your Time | Error Description
* 1:  9:10-9:42   两端一定是必有最大的，从最大值开始存，保证有序
* 2:  
* 3:  
* 4:  
*/

// @lc code=start
class Solution {
    public static void main(String[] args) {
        
    }
    /*
     * 1、输入：递增数组
     * 2、返回：新数组（元素平方）递增排序
     * 特点：
     *      两端最大，最大值都在两端
     */
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int sortedindex = res.length-1; //从最大下表开始放
        int p0=0,p1=res.length-1;
        while (sortedindex>=0) {
            if (nums[p0]*nums[p0]<nums[p1]*nums[p1])
                res[sortedindex--]=nums[p1]*nums[p1--];//放全局第一个最大
            else 
                res[sortedindex--]=nums[p0]*nums[p0++];
        }
        return res;
    }
}
// @lc code=end

