package com.review.算法;

import java.util.Arrays;

/**
 * @author 小白
 * @create 2021/4/13
 */
public class Sort01 {
    public static void main(String[] args) {
         int [] arr={12,34,1,3,65,2};
        System.out.println(Arrays.toString(sortArray(arr)));
    }
        // 插入排序：稳定排序，在接近有序的情况下，表现优异
        public static int[] sortArray(int[] nums) {
            int len = nums.length;
            // 循环不变量：将 nums[i] 插入到区间 [0, i) 使之成为有序数组
            for (int i = 1; i < len; i++) {
                // 先暂存这个元素，然后之前元素逐个后移，留出空位
                int temp = nums[i];
                int j = i;
                // 注意边界 j > 0
                while (j > 0 && nums[j - 1] > temp) {
                    nums[j] = nums[j - 1];
                    j--;
                }
                nums[j] = temp;
            }
            return nums;
    }
}
