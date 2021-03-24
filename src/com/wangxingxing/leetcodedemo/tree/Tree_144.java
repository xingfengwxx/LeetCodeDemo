package com.wangxingxing.leetcodedemo.tree;

import java.util.ArrayList;
import java.util.List;

/**
 *  author : ������
 *  date : 2021/3/24 17:06
 *  email : 1099420259@qq.com
 *  description : 144. ��������ǰ�����
 *
 *  https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 *
 *  ����������ĸ��ڵ� root ���������ڵ�ֵ�� ǰ�� ������
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
