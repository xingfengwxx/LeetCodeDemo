package com.wangxingxing.leetcodedemo.linkedlist;

/**
 * author : 王星星
 * date : 2021/11/5$ 16:28$
 * email : 1099420259@qq.com
 * description :
 */
public class ListNode {
    public  int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
