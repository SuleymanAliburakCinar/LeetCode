package org.example.dailyleet;

public class d240709 {

    class Solution {

        public double averageWaitingTime(int[][] customers) {

            double currentTime = 0;
            double totalWaitingTime = 0;

            for(int[] customer : customers){
                if(currentTime < customer[0]){
                    currentTime = (double)customer[0] + customer[1];
                    totalWaitingTime += customer[1];
                }
                else{
                    currentTime += customer[1];
                    totalWaitingTime += (currentTime - customer[0]);
                }
            }
            return totalWaitingTime / customers.length;
        }
    }
}
