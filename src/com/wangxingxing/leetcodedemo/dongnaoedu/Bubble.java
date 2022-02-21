package com.wangxingxing.leetcodedemo.dongnaoedu;

import java.util.Arrays;

/**
 * author : 王星星
 * date : 2022/2/21 13:47
 * email : 1099420259@qq.com
 * description : 冒泡排序
 */
public class Bubble {

    /**
     * 对数组a中的元素进行排序
     *
     * @param a
     */
    public static void sort(Comparable[] a) {
        // 外层循环控制冒泡次数，内层循环控制比较次数
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                //比较索引j和索引j+1处的值
                if (greater(a[j], a[j + 1])) {
                    exch(a, j, j + 1);
                }
            }
            System.out.printf("第 %d 次冒泡，结果为：%s \n", i, Arrays.toString(a));
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
     *
     * @param args
     */
    public static void main(String[] args) {
        Integer[] a = {4, 5, 6, 3, 2, 1};
        Bubble.sort(a);
        System.out.println(Arrays.toString(a));
    }
}


