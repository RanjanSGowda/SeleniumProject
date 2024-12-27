package Java.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr= {1,3,2,6,4,8,7,9};
        int start = 0, temp;
        int end = arr.length - 1;

        System.out.println("Normal Array");
        for (int a : arr) {
            System.out.print(a+ " ");
        }
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println();
        System.out.println("Reversed Array");
        for (int b : arr) {
            System.out.print(b + " ");

        }
    }
}
