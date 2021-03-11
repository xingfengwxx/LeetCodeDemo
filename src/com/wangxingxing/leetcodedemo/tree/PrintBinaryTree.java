package com.wangxingxing.leetcodedemo.tree;

import java.util.ArrayList;
import java.util.List;

/**
 *  author : 王星星
 *  date : 2021/3/11 18:02
 *  email : 1099420259@qq.com
 *  description : 从上到下按层打印二叉树
 *  从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 *
 *  https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/
 *
 *  递归层次遍历
 */
public class PrintBinaryTree {

    private List<List<Integer>> node = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        lei(root, 0);
        return node;
    }

    public void lei(TreeNode root, int k) {
        if (root != null) {
            if (node.size() <= k)
                node.add(new ArrayList<>());
            node.get(k).add(root.val);
            lei(root.left, k + 1);
            lei(root.right, k + 1);
        }
    }
}
