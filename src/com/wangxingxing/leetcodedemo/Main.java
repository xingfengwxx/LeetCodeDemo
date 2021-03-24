package com.wangxingxing.leetcodedemo;

import com.wangxingxing.leetcodedemo.tree.*;

import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

//        leetcode_1();
//        leetcode_2();

//        leetcode_98();
        leetcode_144();
    }

    public static TreeNode initTreeNodeRoot() {
        TreeNode treeNodeLeft = new TreeNode(9, null, null);
        TreeNode treeNodeRight = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));
        TreeNode treeNodeRoot = new TreeNode(3, treeNodeLeft, treeNodeRight);
        return treeNodeRoot;
    }

    public static void leetcode_1() {
        System.out.println("平衡二叉树=====================");
        System.out.println("root = [3,9,20,null,null,15,7]");

        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        boolean ret = balancedBinaryTree.isBalanced(initTreeNodeRoot());
        System.out.println("isBalanced=" + ret);
    }

    public static void leetcode_2() {
        System.out.println("从上到下按层打印二叉树=====================");
        System.out.println("root = [3,9,20,null,null,15,7]");

        PrintBinaryTree printBinaryTree = new PrintBinaryTree();
        List<List<Integer>> retList = printBinaryTree.levelOrder(initTreeNodeRoot());
        System.out.println(Arrays.toString(retList.toArray()));
    }

    public static void leetcode_98() {
        System.out.println("验证二叉搜索树=====================");
        Tree_98 tree_98 = new Tree_98();

        System.out.println("treeNode1 = [2,1,3]");
        TreeNode treeNode1 = new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null));
        System.out.println("treeNode1 isValidBST: " + tree_98.isValidBST(treeNode1));

        System.out.println("treeNode2 = [5,1,4,null,null,3,6]");
        TreeNode left = new TreeNode(1, null, null);
        TreeNode right = new TreeNode(4, new TreeNode(3), new TreeNode(6));
        TreeNode treeNode2 = new TreeNode(5, left, right);
        System.out.println("treeNode2 isValidBST: " + tree_98.isValidBST(treeNode2));
    }

    public static void leetcode_144() {
        System.out.println("二叉树的前序遍历=====================");
        Tree_144 tree_144 = new Tree_144();

        System.out.println("root = [1,null,2,3]");
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println(Arrays.toString(tree_144.preorderTraversal(root).toArray()));
    }
}
