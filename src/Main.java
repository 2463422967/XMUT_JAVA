import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.getType;

public class Main {
    public static void main(String[] args) {
        int pd =0;
        Scanner sc =new Scanner(System.in);

        while (sc.hasNextLine()){
            String str1 = sc.nextLine();
            for(int i=0 ;i< str1.length();i++){
                if (str1.charAt(i)>='A' & str1.charAt(i)<='Z'){
                    continue;
                } else if (str1.charAt(i)>='a' && str1.charAt(i)<='z') {
                    continue;
                } else if (str1.charAt(i)>='0' && str1.charAt(i)<='9') {
                    continue;
                } else if (str1.charAt(i)=='_') {
                    continue;
                } else if (str1.charAt(i)=='$') {
                    continue;
                } else if (str1.charAt(i)>=19968  && str1.charAt(i)<=40869) {
                    continue;
                } else {
                    pd = 1;
                }
            }
            if (str1.charAt(0)>='0' && str1.charAt(0)<='9' | pd == 1){
                System.out.println("false");
            }else {
                System.out.println("true");
            }
        }
    }
}

