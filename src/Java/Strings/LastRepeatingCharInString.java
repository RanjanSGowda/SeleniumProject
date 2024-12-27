package Java.Strings;

import java.util.HashMap;
import java.util.Map;

public class LastRepeatingCharInString {
    public static void main(String[] args) {
        String str = "easiest";

        char[] ch = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

      for(char c:ch){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char lastchar = ' ';
        for (int i = ch.length - 1; i >= 0; i--) {
            char c = ch[i];
            if (map.get(c) == 1) {
                lastchar = c;
                break;
            }
        }
        System.out.println(lastchar);

    }
}

