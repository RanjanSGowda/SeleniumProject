package Java.Numbers;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 371;
        int originalNum = num;
        int result = 0;

        while (num != 0) {
            int rem = num % 10;
            result += Math.pow(rem, 3);
            num = num / 10;
        }
        System.out.println(result);

        if (originalNum == result) {
            System.out.println(result + " is a Amstrong Number");
        } else {
            System.out.println(result + " is not a Amstrong Number");

        }

    }
}

