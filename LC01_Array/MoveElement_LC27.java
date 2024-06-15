package LC01_Array;

/**
* Run Successful Total Time Field
Website: https://leetcode.cn/problems/remove-element/description/
* Your Time | Error Description
* 1:  背模板吧
* 2:  
* 3:  
* 4:  
*/
public class MoveElement_LC27 {
    public static int removeElement(int[] nums, int val) {
        int count=0;
        for (int p2 = 0; p2 < nums.length;p2++) {
            if(val != nums[p2])
                nums[count++]=nums[p2];
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,1,3,4,5};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }
}
