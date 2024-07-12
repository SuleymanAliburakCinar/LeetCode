package org.example.dailyleet;

//https://leetcode.com/problems/maximum-score-from-removing-substrings/
public class d240712 {

    class Solution {
        public int maximumGain(String s, int x, int y) {
            int result = 0;
            String subString = "";

            //Find substing which include only 'a' and 'b'. Then calculate max point for substring and update result
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == 'a' || ch == 'b') {
                    subString += s.charAt(i);
                } else if (!subString.isEmpty()) {
                    result += calculateMaxPoint(subString, x, y);
                    subString = "";
                }
            }
            if(!subString.isEmpty()) result += calculateMaxPoint(subString, x, y);

            return result;
        }

        //Find possible 'ab' and 'ba' option and calculate max point
        public int calculateMaxPoint(String subString, int x, int y) {
            int aCount = 0;
            int bCount = 0;
            int xCount = 0;
            int yCount = 0;
            int maxA = 0;
            int maxB = 0;

            for (int i = 0; i < subString.length(); i++) {
                char ch = subString.charAt(i);
                if (ch == 'a') {
                    aCount++;
                    maxA++;
                    if(bCount>0) {
                        yCount++;
                        bCount--;
                    }
                }
                else if (ch == 'b') {
                    bCount ++;
                    maxB++;
                    if(aCount>0) {
                        xCount++;
                        aCount--;
                    }
                }
            }
            int max = Math.min(maxA, maxB);
            return x > y ? (x * xCount + (max - xCount) * y) : (y * yCount + (max - yCount) * x);
        }
    }
}
