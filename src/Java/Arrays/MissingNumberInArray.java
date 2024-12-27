package Java.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7};
        int n=arr.length+1;
        int totalsum=(n*(n+1))/2;
        int sum=0;
        for(int num:arr)
        {
            sum=sum+num;
        }
        int missingnumber=totalsum-sum;
        System.out.println(missingnumber);
    }
}
