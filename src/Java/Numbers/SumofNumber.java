package Java.Numbers;

public class SumofNumber {
    public static void main(String[] args) {
        int num=12;
        int sum=0;

        while (num!=0)
        {
            int remainder=num%10;
            sum=sum+remainder;
            num=num/10;
        }
        System.out.println(sum);
    }
}
