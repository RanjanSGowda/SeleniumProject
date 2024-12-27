package Java.Numbers;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
int start=2;
int end=20;
primeNumRange(start,end);
    }
    public static void primeNumRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (primeNumcheck(i)) {
                System.out.print(i + " ");

            }
        }
    }

    public static boolean primeNumcheck(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
