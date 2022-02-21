package com.wangxingxing.leetcodedemo.dongnaoedu;

import java.util.Arrays;

/**
 * author : 王星星
 * date : 2022/2/21 14:45
 * email : 1099420259@qq.com
 * description : 插入排序
 */
public class Insertion {

    /**
     * 对数组a中的元素进行排序
     *
     * @param a
     */
    public static void sort(Comparable[] a) {
        // 8个元素，排序 7 次
        // 第 1 次排序，有序列表中有 1 个元素参与比较
        // 第 2 次排序，有序列表中有 2 个元素参与比较
        // ...
        // 外层循环控制排序次数，内层循环控制比较次数
        for (int i = 1; i < a.length; i++) {
            System.out.println(i);
            for (int j = i; j > 0; j--) {
                //比较索引j处的值和索引j-1处的值，如果索引j-1处的值比索引j处的值大，则交换数据，如果不大，那么就找到合适的位置了，退出循环即可；
                if (greater(a[j - 1], a[j])) {
                    exch(a, j - 1, j);
                } else {
                    break;
                }
            }
        }
    }

    /**
     * 比较v元素是否大于w元素
     *
     * @param v
     * @param w
     * @return
     */
    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    /**
     * 数组元素i和j交换位置
     *
     * @param a
     * @param i
     * @param j
     */
    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        Integer[] a = {4, 3, 2, 10, 12, 1, 5, 6};
        Insertion.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
