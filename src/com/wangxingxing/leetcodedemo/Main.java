package com.wangxingxing.leetcodedemo;

import com.wangxingxing.leetcodedemo.tree.BalancedBinaryTree;
import com.wangxingxing.leetcodedemo.tree.PrintBinaryTree;
import com.wangxingxing.leetcodedemo.tree.TreeNode;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static TreeNode mTreeNodeRoot;

    public static void main(String[] args) {

        initTreeNodeRoot();

//        leetcode_1();
        leetcode_2();
    }

    public static void initTreeNodeRoot() {
        TreeNode treeNodeLeft = new TreeNode(9, null, null);
        TreeNode treeNodeRight = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));
        mTreeNodeRoot = new TreeNode(3, treeNodeLeft, treeNodeRight);
    }

    public static void leetcode_1() {
        System.out.println("平衡二叉树=====================");
        System.out.println("root = [3,9,20,null,null,15,7]");

        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        boolean ret = balancedBinaryTree.isBalanced(mTreeNodeRoot);
        System.out.println("isBalanced=" + ret);
    }

    public static void leetcode_2() {
        System.out.println("从上到下按层打印二叉树=====================");
        System.out.println("root = [3,9,20,null,null,15,7]");

        PrintBinaryTree printBinaryTree = new PrintBinaryTree();
        List<List<Integer>> retList = printBinaryTree.levelOrder(mTreeNodeRoot);
        System.out.println(Arrays.toString(retList.toArray()));
    }
}
