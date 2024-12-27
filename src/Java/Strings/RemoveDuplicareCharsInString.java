package Java.Strings;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicareCharsInString {
    public static void main(String[] args) {
        String str="aaabbsdjdjbdb";

        //  LinkedHashSet<> --  absdj --> Unsorted string
        //  TreeSet<>  -- abdjs --> Sorted string
        Set<Character> charset=new TreeSet<>();

        for(char c: str.toCharArray())
        {
            charset.add(c);

        }
        System.out.println(charset);

        StringBuilder result=new StringBuilder();
        for (char c : charset)

        {
            result.append(c);
        }

        System.out.println(result);
    }
}
