package Java.Numbers;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num=1230;
        int reverse=0;
        int orinalNum=num;

        while(num!=0)
        {
            int remiander=num%10;
            reverse=reverse*10+remiander;
            num=num/10;
        }

        if(orinalNum==reverse)
        {
            System.out.println("The given number " + orinalNum + " is palindrom");
        }
        else
        {
            System.out.println("The given number " + orinalNum + " is not a palindrom");

        }

    }

}
