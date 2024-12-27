package Java.Strings;

import java.util.HashMap;
import java.util.Map;

public class AllRepeatingCharInString {
    public static void main(String[] args) {
        String str="aabbcccddq";
        char[] ch=str.toCharArray();

        Map<Character, Integer> map=new HashMap<>();

        for (char c: ch)
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character,Integer> entry:map.entrySet()) {
            if (entry.getValue() > 1) {
//                System.out.println("The char " + entry.getKey() + " is repeating " + entry.getValue()+" times");
                System.out.println(entry.getKey()+" : "+ entry.getValue());
            }
        }
    }
}


