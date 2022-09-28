package zy;

import java.util.Arrays;

/**
 * @ClassName: sy3_3test
 * @Description: TODO
 * @Author: Hard_cheng
 * @Date: 2022/9/29 1:41
 * @Version: 1.0
 */
public class sy3_3test {
    public static void main(String[] args) {
        //8 1 2 5
        int[] minArray = new int[]{0,0,0};
        int min = 10;
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <=4 ; j++) {
                for (int k = 0; k <=9 ; k++) {
                    if(i*5+j*2+k==8){
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
        System.out.println(Arrays.toString(minArray));
    }
}
