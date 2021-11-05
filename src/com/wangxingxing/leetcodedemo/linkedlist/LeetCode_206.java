package com.wangxingxing.leetcodedemo.linkedlist;

import com.wangxingxing.leetcodedemo.Utils;

/**
 * author : 王星星
 * date : 2021/11/5 15:56
 * email : 1099420259@qq.com
 * description : 206. 反转链表
 * <p>
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class LeetCode_206 {

    public static ListNode reverseListIterative(ListNode head) {
        ListNode prev = null; //前指针节点
        ListNode curr = head; //当前指针节点
        //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
        while (curr != null) {
            ListNode nextTemp = curr.next; //临时节点，暂存当前节点的下一节点，用于后移
            curr.next = prev; //将当前节点指向它前面的节点
            prev = curr; //前指针后移
            curr = nextTemp; //当前指针后移
        }
        return prev;
    }

    public static void main(String[] args) {
        //输入：head = [1,2,3,4,5]
        //输出：[5,4,3,2,1]
        ListNode listNode = new ListNode(1,
                new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode reverseListNode = reverseListIterative(listNode);
        System.out.println(Utils.printListFromTailToHead(reverseListNode));
    }


}
