package com.wangxingxing.leetcodedemo.linkedlist;

/**
 * author : 王星星
 * date : 2021/11/5$ 17:28$
 * email : 1099420259@qq.com
 * description : 面试题 02.08. 环路检测
 *
 * https://leetcode-cn.com/problems/linked-list-cycle-lcci/
 */
public class Interview_0208 {

    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                fast = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        //输入：head = [3,2,0,-4], pos = 1
        //输出：tail connects to node index 1
        //解释：链表中有一个环，其尾部连接到第二个节点。
        ListNode node3 = null;

        ListNode node2 = new ListNode(0, node3);
        ListNode node1 = new ListNode(2, node2);
        node3 = new ListNode(-4, node1);
        ListNode root = new ListNode(3, node1);

        System.out.println(detectCycle(root));
    }
}
