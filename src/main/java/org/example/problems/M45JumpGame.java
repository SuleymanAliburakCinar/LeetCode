package org.example.problems;

import java.util.Arrays;

public class M45JumpGame {

    static class Solution {
        static public int jump(int[] nums) {
            int[] costArr = new int[nums.length];
            Arrays.fill(costArr, Integer.MAX_VALUE);
            costArr[0] = 0;

            for (int i = 0; i < nums.length; i++) {
                int maxTravelLength = nums.length - (i + 1);

                for (int j = 1; j <= Math.min(maxTravelLength, nums[i]); j++) {
                    if (costArr[i] + 1 < costArr[i + j]) {
                        costArr[i + j] = costArr[i] + 1;
                    }
                }
            }
            return costArr[nums.length - 1];
        }

        public static void main(String[] args) {
            int[] arr = {2, 3, 1, 1, 4};
            System.out.println(jump(arr));
        }
    }
}
