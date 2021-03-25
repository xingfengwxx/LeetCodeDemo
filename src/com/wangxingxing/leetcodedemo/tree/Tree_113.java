package com.wangxingxing.leetcodedemo.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 *  author : 王星星
 *  date : 2021/3/25 10:01
 *  email : 1099420259@qq.com
 *  description : 113. 路径总和 II
 *
 *  给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
 *
 * 叶子节点 是指没有子节点的节点。
 *
 *
 * 示例 1：
 *
 *
 * 输入：root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
 * 输出：[[5,4,11,2],[5,8,4,5]]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/path-sum-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 *  * 问完成一件事情的所有解决方案，一般采用回溯算法（深度优先遍历）完成。
 *  *
 *  * 思路：我们可以采用 先序遍历 的方式：先使用 sum 减去当前结点（如果非空）的值，
 *  * 然后再递归处理左子树和右子树。如果到了叶子结点，sum 恰好等于叶子结点的值，
 *  * 我们就得到了一个符合条件的列表（从根结点到当前叶子结点的路径）。
 *
 * 	归纳一下递归终止条件：
 *
 * 	如果遍历到的结点为空结点，返回；
 * 	如果遍历到的叶子结点，且 sum 恰好等于叶子结点的值。
 */
public class Tree_113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Deque<Integer> path = new ArrayDeque<>();

        dfs(root, targetSum, path, res);

        return res;
    }

    private void dfs(TreeNode node, int sum, Deque<Integer> path, List<List<Integer>> res) {
        // 递归终止条件 1
        if (node == null) {
            return;
        }

        // 递归终止条件 2
        if (node.val == sum && node.left == null && node.right == null) {
            // 当前结点的值还没添加到列表中，所以要先添加，然后再移除
            path.addLast(node.val);
            res.add(new ArrayList<>(path));
            path.removeLast();
            return;
        }

        path.addLast(node.val);
        dfs(node.left, sum - node.val, path, res);
        // 进入左右分支的 path 是一样的，这里不用写下面两行，因为一定会调用到 path.removeLast();
        // path.removeLast();
        // path.addLast(node.val);
        dfs(node.right, sum - node.val, path, res);
        path.removeLast();
    }
}
