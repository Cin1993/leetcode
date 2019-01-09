package src.com.cinnnn.NowCoder;

//给定一个英文字符串,请写一段代码找出这个字符串中首先出现三次的那个英文字符(需要区分大小写)。

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstMost3TimesCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : string.toCharArray()){
            if ( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
                if (map.get(c) == 3){
                    System.out.println(c);
                    break;
                }
            }
        }
    }
}
