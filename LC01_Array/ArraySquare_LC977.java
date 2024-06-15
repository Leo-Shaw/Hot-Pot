package LC01_Array;
/**
* Run Successful Total Time Field
Website: https://leetcode.cn/problems/squares-of-a-sorted-array/description/
* Your Time | Error Description
* 1:  9:10-9:42   两端一定是必有最大的，从最大值开始存，保证有序
* 2:  
* 3:  
* 4:  
*/
public class ArraySquare_LC977 {
    /*
     * 1、输入：递增数组
     * 2、返回：新数组（元素平方）递增排序
     * 特点：
     *      两端最大，最大值都在两端
     */
    public static int[] sortedSquares(int[] nums) {
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
    
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,1,3,10};
        for (int i : sortedSquares(nums)) {
            System.out.println(i);
        }
    }

}
