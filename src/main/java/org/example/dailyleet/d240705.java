package org.example.dailyleet;

import java.util.Arrays;

//https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/?envType=daily-question&envId=2024-07-05
public class d240705 {

    static class Solution {
        public static int[] nodesBetweenCriticalPoints(ListNode head) {
            int[] result = new int[2];
            Arrays.fill(result, Integer.MAX_VALUE);
            int min = Integer.MAX_VALUE;
            int max = 0;
            int last = 0;
            int iterator = 0;
            if (head.next.next == null) {
                result[0] = -1;
                result[1] = -1;
                return result;
            }
            while (head.next != null && head.next.next != null) {
                ListNode tmpNode = head;
                head = head.next;
                iterator++;
                if ((tmpNode.val < head.val && head.next.val < head.val) || (tmpNode.val > head.val && head.next.val > head.val)) {
                    if (iterator < min) min = iterator;
                    if (iterator > max) max = iterator;
                    if (last != 0){
                        if( (iterator -last ) < result[0]) result[0] = iterator-last;
                    }
                    last = iterator;
                }

            }
            result[1] = max - min;
            if(result[1] < 0 || max == min) {
                result[0] = -1;
                result[1] = -1;
            }
            return result;
        }

        public static void main(String[] args) {
            ListNode a = new ListNode(2);
            ListNode b = new ListNode(2);
            ListNode c = new ListNode(1);
            ListNode d = new ListNode(3);
            a.next = b;
            b.next = c;
            c.next = d;
            System.out.println(Arrays.toString(nodesBetweenCriticalPoints(a)));
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
