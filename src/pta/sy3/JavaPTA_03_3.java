package pta.sy3;

import java.util.Scanner;

/**
 * @ClassName: JavaPTA_03_3
 * @Description:
                请编程程序，实现如下功能：输入直接三角形的两个直角边的边长，求它们的斜边边长，结果保留2位小数。

                提示：在Java中利用Math类的方法——**Math.sqrt()**求平方根。

                java.lang.Math.sqrt(double a) 返回一个double值的正平方根。

                输入格式:
                输入有若干行，每行有2个数值，分别表示直角三角形的两个直角边长度，用空格分隔。

                输出格式:
                对应每行输入数据，输出直角三角形的斜边长度，结果保留2位小数。

                输入样例：
                3 4
                2.3 3
                5 6
                10 12
                输出样例:
                在这里给出相应的输出。例如：

                5.00
                3.78
                7.81
                15.62
 * @Author: Hard_cheng
 * @Date: 2022/10/8 1:46
 * @Version: 1.0
 */
public class JavaPTA_03_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String data = sc.nextLine();
            String[] str = data.split(" ");
            System.out.printf("%.2f",Math.sqrt(
                    Math.pow(Double.parseDouble(str[0]),2)+Math.pow(Double.parseDouble(str[1]),2)));
            System.out.println();
        }
    }
}
