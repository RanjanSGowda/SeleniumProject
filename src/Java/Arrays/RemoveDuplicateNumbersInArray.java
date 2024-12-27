package Java.Arrays;

import java.util.Arrays;
import java.util.*;

public class RemoveDuplicateNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2,2,3,22,5,6,7,8,8,5,33,2};
        int len = arr.length;
        int j = 0;

        //Method 1
        Set<Integer> set=new TreeSet<>();

        for(int n:arr)
        {
            set.add(n);

        }

        System.out.println(set);

    }
}
