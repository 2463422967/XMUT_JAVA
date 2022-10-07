package pta.sy3;

import java.util.Scanner;

/**
 * @ClassName: JavaPTA_03_5
 * @Description:
                背景：
                海伦公式又译作希伦公式、海龙公式、希罗公式、海伦—秦九韶公式。它是利用三角形的三条边的边长直接求三角形面积的公式。它的特点是形式漂亮，便于记忆。
                相传这个公式最早是由古希腊数学家阿基米德得出的，而因为这个公式最早出现在海伦的著作《测地术》中，所以被称为海伦公式。

                中国秦九韶也得出了类似的公式，称三斜求积术。
                输入格式:
                输入若干行。每行有3个数值。

                输出格式:
                对于每一行输入，有一行输出。

                若三个数值能够构成三角形的边，则计算它的面积，保留2位小数；如果不能构造三角形，则输出“Input Error!"。

                输入样例:
                3  4  5.0
                1  2  3.0
                -3 0 -2
                输出样例:
                6.00
                Input Error!
                Input Error!
 * @Author: Hard_cheng
 * @Date: 2022/10/8 2:09
 * @Version: 1.0
 */
public class JavaPTA_03_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double p =(a+b+c)/2;
            if (a+b<=c || a-b>=c){
                System.out.println("Input Error!");
            }else {
                double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                System.out.printf("%.2f\n",s);
            }
        }
    }
}
