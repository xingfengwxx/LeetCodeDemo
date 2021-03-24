package com.wangxingxing.leetcodedemo.tree;

/**
 * author : ������
 * date : 2021/3/24 17:57
 * email : 1099420259@qq.com
 * description : 105. ��ǰ��������������й��������
 * <p>
 * <p>
 * ����һ������ǰ�������������������������
 * <p>
 * ע��:
 * ����Լ�������û���ظ���Ԫ�ء�
 * <p>
 * ���磬����
 * <p>
 * ǰ����� preorder = [3,9,20,15,7]
 * ������� inorder = [9,3,15,20,7]
 * �������µĶ�������
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 */
public class Tree_105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    private TreeNode buildTreeHelper(int[] preorder, int p_start, int p_end, int[] inorder, int i_start, int i_end) {
        // preorder Ϊ�գ�ֱ�ӷ��� null
        if (p_start == p_end) {
            return null;
        }
        int root_val = preorder[p_start];
        TreeNode root = new TreeNode(root_val);
        //������������ҵ����ڵ��λ��
        int i_root_index = 0;
        for (int i = i_start; i < i_end; i++) {
            if (root_val == inorder[i]) {
                i_root_index = i;
                break;
            }
        }
        int leftNum = i_root_index - i_start;
        //�ݹ�Ĺ���������
        root.left = buildTreeHelper(preorder, p_start + 1, p_start + leftNum + 1, inorder, i_start, i_root_index);
        //�ݹ�Ĺ���������
        root.right = buildTreeHelper(preorder, p_start + leftNum + 1, p_end, inorder, i_root_index + 1, i_end);
        return root;
    }
}
