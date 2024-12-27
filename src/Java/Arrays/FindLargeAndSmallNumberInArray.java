package Java.Arrays;

import java.util.Arrays;

public class FindLargeAndSmallNumberInArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,78,566,88};

        //Method 1
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int largenumber=arr[arr.length-1];
        System.out.println(largenumber);

        int smallnumber=arr[0];
        System.out.println(smallnumber);

        //Method 2

        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                int temp=0;

                if(arr[i]>arr[j])
                {
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                }
            }
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        int largenumber1=arr[arr.length-1];
        System.out.println("Largest number is --> " + largenumber);

        int smallnumber1=arr[0];
        System.out.println("Smallest number is -->" +
                " " + smallnumber);


    }
}
