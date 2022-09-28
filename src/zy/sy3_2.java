package zy;
import java.util.Scanner;

/**
 * @ClassName: sy3_2
 * @Description: 编写一个应用程序，以用户输入的形式读取小时、分、秒的时间数据
 * 然后全部换算成秒并打印输出结果（例如，1小时28分42秒等于5322秒）。
 * @Author: Hard_cheng
 * @Date: 2022/9/28 22:53
 * @Version: 1.0
 */
public class sy3_2  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour, minute, second;
        System.out.print("Enter Hour: ");
        hour = input.nextInt();
        System.out.print("Enter Minute: ");
        minute = input.nextInt();
        System.out.print("Enter Second: ");
        second = input.nextInt();
        System.out.println(hour+"小时"+minute+"分钟"+second+"秒"+"等于"+ ((hour*3600) +
                (minute*60) + second)+"秒");
    }
}
