package com.wangxingxing.leetcodedemo;

import com.wangxingxing.leetcodedemo.tree.BalancedBinaryTree;
import com.wangxingxing.leetcodedemo.tree.TreeNode;

public class Main {

    public static void main(String[] args) {
        leetcode_1();
    }

    public static void leetcode_1() {
        System.out.println("平衡二叉树=====================");
        System.out.println("root = [3,9,20,null,null,15,7]");

        TreeNode treeNodeLeft = new TreeNode(9, null, null);
        TreeNode treeNodeRight = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));
        TreeNode treeNodeRoot = new TreeNode(3, treeNodeLeft, treeNodeRight);

        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        boolean ret = balancedBinaryTree.isBalanced(treeNodeRoot);
        System.out.println("isBalanced=" + ret);
    }
}
