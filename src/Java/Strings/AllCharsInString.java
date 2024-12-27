package Java.Strings;

import java.util.*;

public class AllCharsInString {
    public static void main(String[] args) {
        String str="easiest";
//        char[] ch=str.toCharArray();

        Map<Character, Integer> map= new HashMap<>();

        for(char c:str.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println("The Chars in Strings are --> "+ map);

    }
}