package com.wangxingxing.leetcodedemo.tree;

import java.util.ArrayList;
import java.util.List;

/**
 *  author : 王星星
 *  date : 2021/3/24 17:06
 *  email : 1099420259@qq.com
 *  description : 144. 二叉树的前序遍历
 *
 *  https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 *
 *  给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 */
public class Tree_144 {
    List<Integer> preorderList = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            preorderList.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return preorderList;
    }
}
