package Java.Arrays;

public class ArrayStringSort {

    public static void main(String[] args) {

        String[] arr = {"Ranjana", "jagadeesh", "Nehala", "Raja"};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].length() > arr[j].length()) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
