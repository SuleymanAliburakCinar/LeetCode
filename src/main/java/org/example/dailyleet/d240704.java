package org.example.dailyleet;

//https://leetcode.com/problems/merge-nodes-in-between-zeros/submissions/1309059516/?envType=daily-question&envId=2024-07-04
public class d240704 {


    //Definition for singly-linked list.
    public class ListNode {
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

    class Solution {
        public ListNode mergeNodes(ListNode head) {
            ListNode iteretor = head;
            while (iteretor.next != null) {
                if (iteretor.next.next == null) {
                    iteretor.next = null;
                } else {
                    if (iteretor.next.val != 0) {
                        iteretor.val += iteretor.next.val;
                        iteretor.next = iteretor.next.next;
                    } else iteretor = iteretor.next;
                }
            }
            return head;
        }

        public static void main(String[] args) {

        }
    }

}
