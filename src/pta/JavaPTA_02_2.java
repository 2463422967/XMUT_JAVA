package pta;


import java.util.Scanner;

/**
 * @ClassName: JavaPTA_02_2
 * @Description: TODO
 * @Author: Hard_cheng
 * @Date: 2022/9/23 19:23
 * @Version: 1.0
 */
public class JavaPTA_02_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.next();
            System.out.println("choice="+str);
            switch (str) {
                case "double" : db(sc);break;
                case "int" :in(sc);break;
                case "str" : sr(sc);break;
                case "line" : lin(sc);break;
                default : System.out.println("other");
            }
        }

    }
    public static void db(Scanner sc){
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        System.out.printf("%-5.2f,%5.2f,%.2f\n", a, b, c);
    }
    public static void in(Scanner sc){
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println(a + b + c);

    }
    public static void sr(Scanner sc){
        sc.nextLine();
        String d = sc.nextLine();
        String[] dd = d.split("\\s+");
        for (int i = dd.length-1;i>=0;i--){
            System.out.print(dd[i]);
        }
        System.out.println();
    }
    public static void lin(Scanner sc){
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println(str.toUpperCase());
    }
}
