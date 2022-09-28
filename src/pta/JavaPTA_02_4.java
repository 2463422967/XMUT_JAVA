package pta;

import java.util.Scanner;

/**
 * @ClassName: JavaPTA_02_4
 * @Description: TODO
 * @Author: Hard_cheng
 * @Date: 2022/9/23 22:29
 * @Version: 1.0
 */
public class JavaPTA_02_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        while (!str.equals("end")){
            char[] chars = str.toCharArray();
            int a = 0;
            for (char c : chars){
                if (c>='0' && c<='9'){
                    a+=Integer.parseInt(String.valueOf(c));
                }
            }
            System.out.println(a);
            str = scanner.nextLine();
        }
    }
}
