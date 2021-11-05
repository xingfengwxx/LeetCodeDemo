package com.wangxingxing.leetcodedemo.linkedlist;

import com.wangxingxing.leetcodedemo.tree.PrintBinaryTree;
import com.wangxingxing.leetcodedemo.tree.TreeNode;

/**
 * author : 王星星
 * date : 2021/11/5$ 17:14$
 * email : 1099420259@qq.com
 * description : 109. 有序链表转换二叉搜索树
 *
 * https://leetcode-cn.com/problems/convert-sorted-list-to-binary-search-tree/
 */
public class LeetCode_109 {

    public static TreeNode sortedListToBST(ListNode head) {
        if (head == null)
            return null;
        else if (head.next == null)
            return new TreeNode(head.val);
        ListNode pre = head;
        ListNode p = pre.next;
        ListNode q = p.next;
        //找到链表的中点p
        while (q != null && q.next != null) {
            pre = pre.next;
            p = pre.next;
            q = q.next.next;
        }
        //将中点左边的链表分开
        pre.next = null;
        TreeNode root = new TreeNode(p.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(p.next);
        return root;
    }

    public static void main(String[] args) {
        //输入：[-10, -3, 0, 5, 9]
        //输出：[0, -3, 9, -10, null, 5]
        ListNode listNode = new ListNode(-10,
                new ListNode(-3, new ListNode(0, new ListNode(5, new ListNode(9)))));
        TreeNode treeNode = sortedListToBST(listNode);

        PrintBinaryTree printBinaryTree = new PrintBinaryTree();
        System.out.println(printBinaryTree.levelOrder(treeNode));
    }
}
