package com.wangxingxing.leetcodedemo.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 *  author : ������
 *  date : 2021/3/25 10:01
 *  email : 1099420259@qq.com
 *  description : 113. ·���ܺ� II
 *
 *  ����������ĸ��ڵ� root ��һ������Ŀ��� targetSum ���ҳ����� �Ӹ��ڵ㵽Ҷ�ӽڵ� ·���ܺ͵��ڸ���Ŀ��͵�·����
 *
 * Ҷ�ӽڵ� ��ָû���ӽڵ�Ľڵ㡣
 *
 *
 * ʾ�� 1��
 *
 *
 * ���룺root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
 * �����[[5,4,11,2],[5,8,4,5]]
 *
 * ��Դ�����ۣ�LeetCode��
 * ���ӣ�https://leetcode-cn.com/problems/path-sum-ii
 * ����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 *
 *
 *  * �����һ����������н��������һ����û����㷨��������ȱ�������ɡ�
 *  *
 *  * ˼·�����ǿ��Բ��� ������� �ķ�ʽ����ʹ�� sum ��ȥ��ǰ��㣨����ǿգ���ֵ��
 *  * Ȼ���ٵݹ鴦�������������������������Ҷ�ӽ�㣬sum ǡ�õ���Ҷ�ӽ���ֵ��
 *  * ���Ǿ͵õ���һ�������������б��Ӹ���㵽��ǰҶ�ӽ���·������
 *
 * 	����һ�µݹ���ֹ������
 *
 * 	����������Ľ��Ϊ�ս�㣬���أ�
 * 	�����������Ҷ�ӽ�㣬�� sum ǡ�õ���Ҷ�ӽ���ֵ��
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
        // �ݹ���ֹ���� 1
        if (node == null) {
            return;
        }

        // �ݹ���ֹ���� 2
        if (node.val == sum && node.left == null && node.right == null) {
            // ��ǰ����ֵ��û��ӵ��б��У�����Ҫ����ӣ�Ȼ�����Ƴ�
            path.addLast(node.val);
            res.add(new ArrayList<>(path));
            path.removeLast();
            return;
        }

        path.addLast(node.val);
        dfs(node.left, sum - node.val, path, res);
        // �������ҷ�֧�� path ��һ���ģ����ﲻ��д�������У���Ϊһ������õ� path.removeLast();
        // path.removeLast();
        // path.addLast(node.val);
        dfs(node.right, sum - node.val, path, res);
        path.removeLast();
    }
}
