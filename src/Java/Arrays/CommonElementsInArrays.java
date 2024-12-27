package Java.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CommonElementsInArrays {

    // Intersection of given Arrays

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 21, 11};
        int[] arr2 = {1, 2, 56, 2, 3, 4, 2};

        System.out.println("arr1 elements : " + Arrays.toString(arr1));
        System.out.println("arr2 elements : " + Arrays.toString(arr2));

        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();

        for (int i : arr1) {
            set1.add(i);
        }
        for (int i : arr2) {
            set2.add(i);
        }

        set1.retainAll(set2);

        System.out.println("Commom elements : " + set1);


    }
}
