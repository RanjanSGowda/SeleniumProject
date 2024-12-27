package Java.Numbers;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num=10;
        int firstNum=0, secNum=1,nextnum;
        for (int i=0;i<num;i++)
        {
            System.out.print(firstNum + " ");
            nextnum=firstNum+secNum;
            firstNum=secNum;
            secNum=nextnum;
        }
    }
}
