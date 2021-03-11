package com.wangxingxing.leetcodedemo.tree;

/**
 *  author : 王星星
 *  date : 2021/3/11 12:18
 *  email : 1099420259@qq.com
 *  description : 平衡二叉树
 *  给定一个二叉树，判断它是否是高度平衡的二叉树。
 *  本题中，一棵高度平衡二叉树定义为：一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 *  https://leetcode-cn.com/problems/balanced-binary-tree/
 *  https://lyl0724.github.io/2020/01/25/1/
 *
 *
 * 递归的三部曲：
 * 1.终止条件：什么时候递归到头了？此题自然是root为空的时候，空树当然是平衡的。
 * 2.思考返回值，每一级递归应该向上返回什么信息？参考我代码中的注释。
 * 3.单步操作应该怎么写？因为递归就是大量的调用自身的重复操作，因此从宏观上考虑，只用想想单步怎么写就行了，左树和右树应该看成一个整体，即此时树一共三个节点：root，root.left，root.right。
 */
public class BalancedBinaryTree {

    //这个ReturnNode是参考我描述的递归套路的第二步：思考返回值是什么
    //一棵树是BST等价于它的左、右俩子树都是BST且俩子树高度差不超过1
    //因此我认为返回值应该包含当前树是否是BST和当前树的高度这两个信息
    private class ReturnNode {
        int depth;
        boolean isB;

        public ReturnNode(int depth, boolean isB) {
            this.depth = depth;
            this.isB = isB;
        }
    }

    //主函数
    public boolean isBalanced(TreeNode root) {
        System.out.println("TreeNode depth=" + isBST(root).depth);
        return isBST(root).isB;
    }

    //参考递归套路的第三部：描述单次执行过程是什么样的
    //这里的单次执行过程具体如下：
    //是否终止?->没终止的话，判断是否满足不平衡的三个条件->返回值
    public ReturnNode isBST(TreeNode root) {
        if (root == null) {
            return new ReturnNode(0, true);
        }

        //不平衡的情况有3种：左树不平衡、右树不平衡、左树和右树差的绝对值大于1
        ReturnNode left = isBST(root.left);
        ReturnNode right = isBST(root.right);
        if (left.isB == false || right.isB == false) {
            return new ReturnNode(0, false);
        }
        if (Math.abs(left.depth - right.depth) > 1) {
            return new ReturnNode(0, false);
        }

        //不满足上面3种情况，说明平衡了，树的深度为左右俩子树最大深度+1
        return new ReturnNode(Math.max(left.depth,  right.depth) + 1, true);
    }

}
