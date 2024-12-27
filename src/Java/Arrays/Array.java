package Java.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] a={5,4,2,3,1};

        //o/p : 1,5,4,2,3

        int temp=a[0];
        a[0]=a[a.length-1];
        a[a.length-1]=temp;

        for(int n:a)
        {
            System.out.print(n);
        }
    }
}
