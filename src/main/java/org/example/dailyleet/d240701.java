package org.example.dailyleet;

//https://leetcode.com/problems/three-consecutive-odds/description/
public class d240701 {

    static class Solution {

        public static boolean threeConsecutiveOdds(int[] arr) {
            if (arr.length < 3) return false;
            int count = 0;
            if (arr[0] % 2 == 1 && arr[1] % 2 == 1) count = 2;
            for (int i = 2; i < arr.length; i++) {
                if (arr[i] % 2 == 1) count++;
                else count = 0;
                if (count == 3) return true;
            }
            return false;
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 34, 3, 4, 5, 7, 23, 12};

            System.out.println(threeConsecutiveOdds(arr));
        }
    }

}
