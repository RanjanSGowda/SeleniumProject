package Java.Numbers;
public class SwapNumbers {
    public static void main(String[] args) {
       int a=10, b=20, temp;

        //Using third variable
//        temp=a+b; //30
//        a=temp-a; // 20
//        b=temp-a; //10

        //Without using third variable
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a= " +a + " b="+b);
    }

}
