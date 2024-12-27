package Practice;

import java.util.*;

public class ran {
    public static void main(String[] args) {
        String str="Ranjan";

        Map<Character,Integer> map=new HashMap<>();
        for(char c:str.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);

        for(Map.Entry<Character, Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println(entry.getKey() + " : "+ entry.getValue());
            }
        }

        char nc=' ';
        for(char d:str.toCharArray())
        {
            if(map.get(d)==1)
            {
                nc=d;
                break;
            }
        }
        System.out.println(nc);

    }
}
