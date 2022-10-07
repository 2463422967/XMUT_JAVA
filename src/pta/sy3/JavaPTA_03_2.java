package pta.sy3;

import java.util.Scanner;

/**
 * @ClassName: JavaPTA_03_2
 * @Description:
                小白学习了一些复利投资知识，想比较一下复利能多赚多少钱（所谓复利投资，是指每年投资的本金是上一年的本金加收益。
                而非复利投资是指每年投资金额不包含上一年的收益，即固定投资额）。假设他每年固定投资M元（整数），每年的年收益达到P（0<P<1，double)，
                那么经过N（整数）年后，复利投资比非复利投资多收入多赚多少钱呢？计算过程使用双精度浮点数，最后结果四舍五入输出整数（Math的round函数）。

                输入格式:
                M P N

                输出格式:
                复利收入（含本金），非复利收入（含本金），复利比非复利收入多的部分（全部取整，四舍五入）

                输入样例:
                10000 0.2 3
                输出样例:
                17280 16000 1280

 * @Author: Hard_cheng
 * @Date: 2022/10/8 1:27
 * @Version: 1.0
 */
public class JavaPTA_03_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        double P = sc.nextDouble();
        int N = sc.nextInt();
        double money = M,tmp,money_ffl=M;
        for (int i = 0; i < N; i++) {
            tmp = money*P;
            money+=tmp;
            money_ffl+=M*P;
        }
        System.out.print(Math.round(money)+" ");
        System.out.print(Math.round(money_ffl)+" ");
        System.out.print(Math.round(money-money_ffl));
    }
}
