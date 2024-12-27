package Java.Strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharInString {
    public static void main(String[] args) {
        String str="easiaest";
        char[] ch=str.toCharArray();

        Map<Character,Integer> map=new HashMap<>();

        for(char c:ch)
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }


       // To get First NonRepeating Char in String
        char firstnonrepeating=' ';
        for(char c:ch)
        {
            if(map.get(c)==1)
            {
                firstnonrepeating=c;
                break;
            }
        }
                System.out.println(firstnonrepeating);


        // To get Second NonRepeating Char in String
        char secnonrepeating=' ';

        for (char c:ch)
        {
            if(map.get(c)==1)
            {
                if (firstnonrepeating==' ') {
                    firstnonrepeating = c;
                }else {
                    secnonrepeating=c;
                    break;
                }
            }
        }

        System.out.println(secnonrepeating);




    }
}
