package Java.Strings;

import java.util.Set;
import java.util.TreeSet;

public class UniqueCharInString {
    public static void main(String[] args) {
        String str="Ranjan";
        char[] ch=str.toCharArray();

        Set<Character> set=new TreeSet<>();

        for(char c:ch)
        {
            set.add(c);
        }

        System.out.println(set);

        StringBuilder sb=new StringBuilder();
        for(char c:set)
        {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
