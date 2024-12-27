package Java.Arrays;

public class AvgofArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        int sum=0;
        int len=arr.length;
//        double avg=0.0;
        System.out.println(len);

        for(int num:arr)
        {
            sum=sum+num;
        }
       double avg=sum/len;
        System.out.println(avg);

    }
}
