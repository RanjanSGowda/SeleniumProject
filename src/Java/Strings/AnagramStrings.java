package Java.Strings;

import java.util.Set;
import java.util.TreeSet;

public class AnagramStrings {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2 = str2.replaceAll(" ", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("The given strings are not Anagram strings");
        } else {
            Set<Character> set1 = new TreeSet<>();
            Set<Character> set2 = new TreeSet<>();

            for (char c : str1.toCharArray()) {
                set1.add(c);
            }
            for (char c : str2.toCharArray()) {
                set2.add(c);
            }
            if (set1.equals(set2)) {
                System.out.println("The given strings are Anagram strings");
            }
        }
    }
}