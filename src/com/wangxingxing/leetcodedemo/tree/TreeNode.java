package com.wangxingxing.leetcodedemo.tree;

/**
 *  author : 王星星
 *  date : 2021/3/11 14:18
 *  email : 1099420259@qq.com
 *  description : Definition for a binary tree node.
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
