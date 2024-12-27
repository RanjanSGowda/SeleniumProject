package Java.Arrays;
import java.util.*;

import java.util.HashMap;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,1,3,4,2,1,3,2,5,7,5,9};

        Map<Integer,Integer> map=new HashMap<>();
         for(int num: arr)
         {
             map.put(num,map.getOrDefault(num,0)+1);
         }
        System.out.println(map);

         for (Map.Entry<Integer,Integer> entry:map.entrySet())
         {
             if(entry.getValue()>1)
             {
                 System.out.println(entry.getKey());
             }
         }


    }
}
