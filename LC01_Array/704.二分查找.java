package LC01_Array;

/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 */

/**
    * Run Successful Total Time Field
    * Website: https://leetcode.cn/problems/binary-search/
    * Your Time | Error Description
    * 1:  18:37-19:12  35min  right下表忘记减-1;  防溢出:l+(r-l)/2; l<=r
    * 2:  
    * 3:  
    * 4:  
*/

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1,mid=0;
        while(l<=r){
            mid = l+(r-l)/2;
            System.out.println(l+""+r+""+mid);
            if(nums[mid]==target){
                return mid;
            }else if(target<nums[mid]){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }
}
// @lc code=end

