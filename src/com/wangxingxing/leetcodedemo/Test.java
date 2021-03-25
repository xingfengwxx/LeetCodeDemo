package com.wangxingxing.leetcodedemo;

public class Test {
    public static void main(String[] args) {
        // ∞¢¿Ô√Ê ‘Ã‚
        int x = 0;
        int y = 0;
        int k = 0;
        for (int z = 0; z < 5; z++) {
            System.out.println("1===" + x + "" + y + "" + k);
            if ((++x > 2) && (++y > 2) && (k++ > 2)) {
                System.out.println("2===" + x + "" + y + "" + k);
                x++;
                ++y;
                k++;
            }
        }
        System.out.println("3===" + x + "" + y + "" + k);

    }
}
