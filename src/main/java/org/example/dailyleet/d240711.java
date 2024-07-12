package org.example.dailyleet;

//https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/
public class d240711 {

    class Solution {
        public String reverseParentheses(String s) {
            int firstIndex, lastIndex;
            while( (firstIndex = s.lastIndexOf("(")) != -1) {
                lastIndex = s.indexOf(")", firstIndex);
                s = s.substring(0, firstIndex) + reverseStringHelper(s, (firstIndex+1), lastIndex) + s.substring(lastIndex + 1, s.length());
            }
            return s;
        }

        public String reverseStringHelper(String s, int firstIndex, int lastIndex){
            StringBuilder sb = new StringBuilder(s.substring(firstIndex, lastIndex));
            return sb.reverse().toString();
        }
    }
}
