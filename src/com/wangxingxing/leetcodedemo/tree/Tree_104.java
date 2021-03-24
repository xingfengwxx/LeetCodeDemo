package com.wangxingxing.leetcodedemo.tree;

/**
 *  author : 王星星
 *  date : 2021/3/24 17:28
 *  email : 1099420259@qq.com
 *  description : 104. 二叉树的最大深度
 *  https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 *
 *  给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class Tree_104 {

    public int maxDepth(TreeNode root) {
        //如果根结点为空
        if (root == null) {
            //即二叉树的最大深度为0
            return 0;
        } else {
            //递归调用
            //获取左孩子的深度
            int left_height = maxDepth(root.left);
            //获取右孩子的深度
            int right_height = maxDepth(root.right);
            //java.lang.Math.max(参数1，参数2)是一个静态的工具方法，主要用来比较两个相同类型参数的大小，
            // 支持的类型有double，float，int，long四种类型
            return Math.max(left_height, right_height) + 1;
        }
    }
}
