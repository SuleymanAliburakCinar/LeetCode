package org.example.dailyleet;

//https://leetcode.com/problems/crawler-log-folder/
public class d240710 {

    class Solution {
        public int minOperations(String[] logs) {
            int depth = 0;
            for(String log : logs){
                if(log.contains("../")) {
                    if (depth > 0) depth--;
                }
                else if (!log.contains("./")) depth++;
            }

            return depth;
        }
    }
}
