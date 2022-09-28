package pta;


import java.util.Scanner;

/**
 * @ClassName: JavaPTA_02_5
 * @Description: TODO
 * @Author: Hard_cheng
 * @Date: 2022/9/23 22:43
 * @Version: 1.0
 */
public class JavaPTA_02_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings = str.replaceAll("\\s+","").replaceAll("：","--").split("；");
        int a = 0;
        for (String s : strings){
            System.out.println(s);
            String[] s1 = s.split("--");
            a+=Integer.parseInt(s1[1]);
        }
        System.out.println("总价格--"+a);
    }
}
