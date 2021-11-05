package com.wangxingxing.leetcodedemo;

import com.wangxingxing.leetcodedemo.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * author : 王星星
 * date : 2021/11/5$ 16:12$
 * email : 1099420259@qq.com
 * description :
 */
public class Utils {

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(listNode == null) {
            return res;
        }
        Stack<ListNode> nodes = new Stack<ListNode>();
        ListNode head = listNode;
        while(head != null) {
            nodes.push(head);
            head = head.next;
        }
        while(!nodes.empty()) {
            res.add(nodes.peek().val);
            nodes.pop();
        }
        return res;
    }
}
