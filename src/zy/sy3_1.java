package zy;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @ClassName: sy3
 * @Description: （一）浮点数计算
 * 编写一个应用程序，读取两个浮点数，然后打印输出他们的和、差及乘积。
 * @Author: Hard_cheng
 * @Date: 2022/9/28 22:41
 * @Version: 1.0
 */
public class sy3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal d1 = new BigDecimal(Double.toString(sc.nextDouble()));
        BigDecimal d2 = new BigDecimal(Double.toString(sc.nextDouble()));
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1+"+"+d2+"="+d1.add(d2));
        System.out.println(d1+"-"+d2+"="+d1.subtract(d2));
        System.out.println(d1+"*"+d2+"="+d1.multiply(d2));
    }
}
