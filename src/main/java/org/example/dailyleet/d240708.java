package org.example.dailyleet;


import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-the-winner-of-the-circular-game/
//2 more good solution in editorial page
public class d240708 {
    public class Solution {
        public int findTheWinner(int n, int k) {
            int iterator = 0;

            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                list.add(i);
            }

            while (list.size() > 1) {
                iterator = ((iterator + k - 1) % n);
                list.remove(iterator);
                n--;
            }

            return list.getFirst();
        }
    }
}