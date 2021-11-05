package com.wangxingxing.leetcodedemo.linkedlist;

/**
 * author : 王星星
 * date : 2021/11/5$ 16:26$
 * email : 1099420259@qq.com
 * description : 面试题 02.02. 返回倒数第 k 个节点
 *
 * https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/
 */
public class Interview_0202 {

    public static int kthToLast(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        while(k != 0) {
            fast = fast.next;
            k--;
        }
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }

    public static void main(String[] args) {
        //输入：head = [1,2,3,4,5] 2
        //输出：4
        ListNode listNode = new ListNode(1,
                new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(kthToLast(listNode, 2));
    }
}
