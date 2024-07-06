package org.example.dailyleet;

//https://leetcode.com/problems/pass-the-pillow/description/
public class d240706 {

    class Solution {
        public int passThePillow(int n, int time) {
            int iterator = 1;
            boolean direction = true;

            for (int i = 0; i<time; i++){
                if(direction) iterator++;
                else iterator--;
                if(iterator == n || iterator == 1) direction = !direction;
            }
            return iterator;
        }

        //o(1) solution
        public int passThePillow1(int n, int time) {
            int offset = time % (n - 1);
            int direction = time / (n -1);

            if(direction % 2 != 0) return  n -offset;
            else return offset+1;
        }
    }
}
