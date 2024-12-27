package Java.Arrays;

public class SecLargeAndSmallNumberInArray {
    public static void main(String[] args) {
        int[] arr={1,2,34,5,67,8,886,543,3};

        for(int i=1;i<arr.length;i++)
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
        }
        for(int a:arr)
        {
            System.out.print(a + " ");
        }
        System.out.println();

        int secLargeNum=arr[arr.length-2];
        System.out.println("Second Largest Number is " + secLargeNum);

        int secSmallNum=arr[1];
        System.out.println("Second Smallest Number is " + secSmallNum);

    }
}
