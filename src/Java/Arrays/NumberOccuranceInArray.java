package Java.Arrays;

public class NumberOccuranceInArray {
    public static void main(String[] args) {
        int arr[] ={1,6,1,3,4,2,1,6};
        int target =1;
        int count =0;

        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]==target)
            {
                count++;
            }

        }
        System.out.println(count);
    }

}
