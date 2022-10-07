package pta.sy2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @ClassName: JavaPTA_02_3
 * @Description: TODO
 * @Author: Hard_cheng
 * @Date: 2022/9/23 22:01
 * @Version: 1.0
 */
public class JavaPTA_02_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> map =new LinkedHashMap<String,Integer>();

        String str = scanner.next();
        while (!str.equals("end")){
            if (!map.containsKey(str)){
                map.put(str,1);
            }else {
                map.put(str,map.get(str)+1);
            }
            str=scanner.next();
        }
        for (Map.Entry<String,Integer> t:map.entrySet()){
            System.out.println(t.getKey()+" "+t.getValue());
        }
    }
}
