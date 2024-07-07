package org.example.dailyleet;

//https://leetcode.com/problems/water-bottles/
public class d240707 {

    class Solution {
        public int numWaterBottles(int numBottles, int numExchange) {
            int result = 0;
            int emptyBottles = 0;
            int fullBottles = numBottles;
            while (fullBottles > 0) {
                emptyBottles += fullBottles;
                result += fullBottles;
                fullBottles = emptyBottles / numExchange;
                emptyBottles = emptyBottles % numExchange;
            }
            return result;
        }
    }
}
