package com.wangxingxing.leetcodedemo.tree;

/**
 *  author : ������
 *  date : 2021/3/24 17:28
 *  email : 1099420259@qq.com
 *  description : 104. ��������������
 *  https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 *
 *  ����һ�����������ҳ��������ȡ�
 *
 * �����������Ϊ���ڵ㵽��ԶҶ�ӽڵ���·���ϵĽڵ�����
 *
 * ˵��: Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣
 */
public class Tree_104 {

    public int maxDepth(TreeNode root) {
        //��������Ϊ��
        if (root == null) {
            //����������������Ϊ0
            return 0;
        } else {
            //�ݹ����
            //��ȡ���ӵ����
            int left_height = maxDepth(root.left);
            //��ȡ�Һ��ӵ����
            int right_height = maxDepth(root.right);
            //java.lang.Math.max(����1������2)��һ����̬�Ĺ��߷�������Ҫ�����Ƚ�������ͬ���Ͳ����Ĵ�С��
            // ֧�ֵ�������double��float��int��long��������
            return Math.max(left_height, right_height) + 1;
        }
    }
}
