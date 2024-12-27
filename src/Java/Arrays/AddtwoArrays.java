package Java.Arrays;

import java.util.HashSet;
import java.util.Set;

public class AddtwoArrays {
    // Union of given Arrays
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 5, 6, 7};

        Set<Integer> set = new HashSet<>();

        for (int i : arr1) {
            set.add(i);
        }
        for (int i : arr2) {
            set.add(i);
        }

        System.out.println(set);

    }
}

