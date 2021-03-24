package com.wangxingxing.leetcodedemo.tree;

/**
 *  author : 王星星
 *  date : 2021/3/24 15:22
 *  email : 1099420259@qq.com
 *  description : 98. 验证二叉搜索树
 *  给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 假设一个二叉搜索树具有如下特征：
 *
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/validate-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * 思路：一说到二叉搜索树 就要想到特性 比如 用中序便利
 */
public class Tree_98 {

    long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        // 访问左子树
        if (!isValidBST(root.left)) {
            return false;
        }

        // 访问当前节点：如果当前节点小于等于中序遍历的前一个节点，说明不满足BST，返回 false；否则继续遍历。
        if (root.val <= pre) {
            return false;
        }
        pre = root.val;
        // 访问右子树
        return isValidBST(root.right);
    }
}
