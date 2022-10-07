package pta.sy3;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @ClassName: JavaPTA_03_1
 * @Description: 输入若干对浮点数，对每对浮点数输出其精确的和与乘积。
 * 以下输入样例为两对浮点数输入，实际上有可能有不定对数的浮点数需要输入计算。
 * <p>
 * 注1：直接使用double类型数据进行运算，无法得到精确值。<br/>
 * 注2：输出时直接调用BigDecimal的toString方法。
 * <p>
 * 输入样例:
 * 69.1 0.02
 * 1.99 2.01
 * <br/>
 * 输出样例:
 * 69.12
 * 1.382
 * 4.00
 * 3.9999
 * @Author: Hard_cheng
 * @Date: 2022/10/8 1:14
 * @Version: 1.0
 */
public class JavaPTA_03_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String data = sc.nextLine();
            String[] str = data.split(" ");
            BigDecimal d1 = new BigDecimal(str[0]);
            BigDecimal d2 = new BigDecimal(str[1]);
            System.out.println(d1.add(d2));
            System.out.println(d1.multiply(d2));
        }
    }
}
