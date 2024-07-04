package org.example.dailyleet;

import java.util.Arrays;

//https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/description/
public class d240703 {

    static class Solution {
        public static int minDifference(int[] nums) {
            if (nums.length <= 4) return 0;

            nums = Arrays.stream(nums).sorted().toArray();
            int l = 0;
            int r = nums.length - 1;

            return Math.min(Math.min((nums[r] - nums[l + 3]), (nums[r - 1] - nums[l + 2])), Math.min((nums[r - 2] - nums[l + 1]), (nums[r - 3] - nums[l])));
        }

        public static void main(String[] args) {
            int[] nums = {1, 1, 0, 4, 6, 6, 6};
            System.out.println(minDifference(nums));
        }

    }
}
