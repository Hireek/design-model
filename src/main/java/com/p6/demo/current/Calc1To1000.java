package com.p6.demo.current;

import java.util.concurrent.CountDownLatch;

/**
 *
 */
public class Calc1To1000 {

    public static volatile int sum = 0;


    public static void main(String[] args) throws InterruptedException {

        for (int x = 0; x < 1000; x++) {


            // 思路: 拆分 开启五个线程 20为界限
            int[] arraySum = new int[1000];

            final CountDownLatch threadCount = new CountDownLatch(5);

            for (int i = 0; i < 1000; i++) {

                arraySum[i] = i + 1;
            }

            // 数组切割
            int[][] ints = return2DimensionArray(arraySum);

            // 多线程执行和动态的去扩充线程
            for (int i = 0; i < ints.length; i++) {

                int temIndex = i;

                new Thread(() -> {

                    for (int j = 0; j < ints[temIndex].length; j++) {


                        sum = sum + ints[temIndex][j];
                    }

                    threadCount.countDown();
                }).start();
            }

//        while (sum > 0) {
//
//            if (sum == 5050) {
//
//                break;
//            }
//        }
            threadCount.await();
            System.out.println("最终值为: " + sum);
            if (sum != 500500) {
                System.err.println("xxxxx");
            }
            sum = 0;
        }
    }

    /**
     * 一维数组返回二维数组
     *
     * @return 二维数组
     */
    public static int[][] return2DimensionArray(int[] array) {

        // 定义二维数组
        int[][] twoDim = new int[5][200];

        for (int i = 0; i < array.length; i++) {

            twoDim[i / 200][i % 200] = array[i];
        }
        return twoDim;
    }
}
