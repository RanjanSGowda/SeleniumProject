package Java.Numbers;

public class NumberCount {
    public static void main(String[] args) {
        int a=12388;
        int count=0;
        while (a!=0)
        {
            a=a/10;
            count++;
        }
        System.out.println(count);
    }
}
