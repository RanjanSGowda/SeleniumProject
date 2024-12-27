package Java.Numbers;

public class ReverseNumbers {
    public static void main(String[] args) {
        int num=1230;
        int reverse=0;

        while(num!=0)
        {
            int remaninder=num%10;
            reverse =reverse*10+remaninder;
            num=num/10;
        }
        System.out.println(reverse);
    }
}
