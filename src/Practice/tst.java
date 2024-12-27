package Practice;

import java.lang.annotation.ElementType;
import java.util.HashMap;
import java.util.Map;

public class tst {
    public static void main(String[] args) {
        String str = "Ranjan";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}