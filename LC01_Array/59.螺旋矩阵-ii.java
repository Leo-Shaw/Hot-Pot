package LC01_Array;

/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution1 {
    public int[][] generateMatrix(int n) {
        System.out.println("as");
        int[][] array = new int[n][n];
        int nums = 0;
        int i = 0,j=0;
        while (nums<=n*n) {
            do{
                array[i][j++]=nums++;//02
            }while (j < n-1);
            do{
                array[i++][j]=nums++;//22
            }while (i < n-1);
            do{
                array[i][j--]=nums++;//22
            }while (i > 0);
            do{
                array[i--][j]=nums++;//22
            }while (j > 0);
        }

        return null;
        
    }
}
// @lc code=end

