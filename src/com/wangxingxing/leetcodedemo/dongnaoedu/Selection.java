package com.wangxingxing.leetcodedemo.dongnaoedu;

import java.util.Arrays;

/**
 * author : 王星星
 * date : 2022/2/21 14:35
 * email : 1099420259@qq.com
 * description : 选择排序
 */
public class Selection {

    /**
     * 对数组a中的元素进行排序
     *
     * @param a
     */
    public static void sort(Comparable[] a) {
        // 外层循环控制排序次数，内层循环控制比较次数
        for (int i = 0; i < a.length - 1; i++) {
            //定义一个变量，记录最小元素所在的索引，默认为第一个元素所在的位置
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                //如果比 minIndex 处的值小，对 minIndex 重新赋值
                if (greater(a[minIndex], a[j])) {
                    minIndex = j;
                }
            }

            //交换最小元素所在索引minIndex处的值和索引i处的值
            exch(a, i, minIndex);
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


    /**
     * 测试代码
     * @param args
     */
    public static void main(String[] args) {
        Integer[] a = {4, 6, 8, 7, 9, 2, 10, 1};
        Selection.sort(a);
        System.out.println(Arrays.toString(a));
    }
}


