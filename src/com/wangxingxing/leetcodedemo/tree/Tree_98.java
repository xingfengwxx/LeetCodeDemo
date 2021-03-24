package com.wangxingxing.leetcodedemo.tree;

/**
 *  author : ������
 *  date : 2021/3/24 15:22
 *  email : 1099420259@qq.com
 *  description : 98. ��֤����������
 *  ����һ�����������ж����Ƿ���һ����Ч�Ķ�����������
 *
 * ����һ��������������������������
 *
 * �ڵ��������ֻ����С�ڵ�ǰ�ڵ������
 * �ڵ��������ֻ�������ڵ�ǰ�ڵ������
 * �������������������������Ҳ�Ƕ�����������
 *
 * ��Դ�����ۣ�LeetCode��
 * ���ӣ�https://leetcode-cn.com/problems/validate-binary-search-tree
 * ����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 *
 *
 * ˼·��һ˵������������ ��Ҫ�뵽���� ���� ���������
 */
public class Tree_98 {

    long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        // ����������
        if (!isValidBST(root.left)) {
            return false;
        }

        // ���ʵ�ǰ�ڵ㣺�����ǰ�ڵ�С�ڵ������������ǰһ���ڵ㣬˵��������BST������ false���������������
        if (root.val <= pre) {
            return false;
        }
        pre = root.val;
        // ����������
        return isValidBST(root.right);
    }
}
