package pta.sy3;

import java.util.Scanner;

/**
 * @ClassName: JavaPTA_03_6
 * @Description:
                体重是反映和衡量一个人健康状况的重要标志之一，过胖和过瘦都不利于健康，BMI（身体质量指数）
                计算方法：体重（以千克为单位）除以身高（以米为单位）的平方。中国成人正常的BMI应在18.5-24之间，
                如果小于18.5为体重不足，如果大于等于24为超重，大于等于28为肥胖。请编写程序，测算身体状态。

                输入格式:
                两个数值：体重（以千克为单位），身高(以米为单位），数值间以空格分隔。例如：65.5 1.75。
                注意：体重的世界纪录是727公斤，身高的世界纪录是2.72米。输入数据上限不得超过纪录，下限不得小于等于0；

                输出格式:
                输入数值超出范围 ：输出“input out of range”。例如：-2 3或者125 5。
                BMI小于18.5 ：输出“thin”。
                BMI大于等于18.5小于24 ：输出“fit”。
                BMI大于等于24小于28 ：输出“overweight”。
                BMII大于等于28 ：输出“fat”。

                输入样例0:
                在这里给出一组输入。例如：

                -2  8
                输出样例0:
                在这里给出相应的输出。例如：

                input out of range
                输入样例1:
                在这里给出一组输入。例如：

                70 1.75
                输出样例1:
                在这里给出相应的输出。例如：

                fit
 * @Author: Hard_cheng
 * @Date: 2022/10/8 2:22
 * @Version: 1.0
 */
public class JavaPTA_03_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if (a<=0 || b<=0 || a>727 || b>2.72){
                System.out.println("input out of range");
            }else {
                double bit = a/(Math.pow(b,2));
                if (bit<18.5){
                    System.out.println("thin");
                } else if (bit<24) {
                    System.out.println("fit");
                } else if (bit<28) {
                    System.out.println("overweight");
                } else {
                    System.out.println("fat");
                }
            }
        }
    }
}
