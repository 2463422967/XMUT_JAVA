package zy;

import java.util.Scanner;

/**
 * @ClassName: sy3_3
 * @Description: 编写一个程序，提示输入一个代表总钱数的双精度值，然后确定每种纸币和硬币需要的最少数量以达到输入的总钱数。
 * 假设人民币种类如下：佰圆纸钞，伍拾圆纸钞，贰拾圆纸钞，拾圆纸钞，伍圆纸钞，壹圆硬币，伍角硬币，壹角硬币，壹分硬币。
 * （提示：使用求模运算符，自上而下求得每种钱币的数量）。
 * 例如，输入值为127.63元人民币，那么程序应当输出如下结果：
 * 1张佰圆纸钞；
 * 0张伍拾圆纸钞；
 * 1张贰拾圆纸钞；
 * 0张拾圆纸钞；
 * 1张伍圆纸钞；
 * 2个壹圆硬币；
 * 1个伍角硬币；
 * 1个壹角硬币；
 * 3个壹分硬币。
 * @Author: Hard_cheng
 * @Date: 2022/9/28 23:02
 * @Version: 1.0
 */
public class sy3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = sc.nextDouble();
        int bai =(int)(total /100);
        int shi =(int)(total/10)%10;
        int ge =(int)total % 10;
        int jiao = ((int)(total*10))%10;
        int fen = ((int)(total*100))%10;
        int[] shiarrary = js_one_two_five(shi);
        int[] gearrary = js_one_five(ge);
        int[] jiaoarrary = js_one_five(jiao);
        String pr = "";
        pr+=bai+"张佰圆纸钞\n"+shiarrary[0]+"张伍拾圆纸钞；\n"+shiarrary[1]+"张贰拾圆纸钞；\n"+shiarrary[2]+"张拾圆纸钞；\n"
                + gearrary[0]+"张伍圆纸钞；\n"+ gearrary[1]+"张壹圆纸钞；\n" + jiaoarrary[0]+"个伍角硬币；\n"+ jiaoarrary[1]
                +"个壹角硬币；\n"+fen+"个壹分硬币。";
        System.out.println(pr);
    }

    public static int[] js_one_two_five(int shi){
        int[] minArray = new int[]{0,0,0};
        int min = 10;
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <=4 ; j++) {
                for (int k = 0; k <=9 ; k++) {
                    if(i*5+j*2+k==shi){
                        for (int i1 = 0; i1 < minArray.length; i1++) {
                            min+=minArray[i];
                        }
                        if (i+j+k < min) {
                            for (int i1 = 0; i1 < minArray.length; i1++) {
                                minArray[0]= i;
                                minArray[1]= j;
                                minArray[2]= k;
                            }
                        }
                    }
                }
            }
        }
        return minArray;
    }
    public static int[] js_one_five(int t){
        int[] minArray = new int[]{0,0};
        int min = 10;
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <=9 ; j++) {
                    if(i*5+j==t){
                        for (int i1 = 0; i1 < minArray.length; i1++) {
                            min+=minArray[i];
                        }
                        if (i+j< min) {
                            for (int i1 = 0; i1 < minArray.length; i1++) {
                                minArray[0]= i;
                                minArray[1]= j;
                            }
                        }
                    }
            }
        }
        return minArray;
    }

}
