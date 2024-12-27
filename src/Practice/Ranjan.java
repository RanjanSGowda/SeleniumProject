package Practice;//class Selenium.Ram {
//    int a = 10;
//    String name = "Selenium.Ranjan";
//
//    public void Sum() {
//        int a = 90;
//        System.out.println(this.a);
//    }
//
//}
//
//class Rohan extends Selenium.Ram {
//    int a = 20;
//
//    public void test() {
//        System.out.println(super.a);
//    }
//
//
//}
//
//class nithin extends Rohan {
//    int a = 30;
//
//    public void Test2() {
//        System.out.println("Super sub class");
//        System.out.println(super.a);
//    }
//}
//
//public class Selenium.Ranjan {
//    public static void main(String[] args) {
//        nithin r = new nithin();
//        r.Sum();
//        r.test();
//        r.Test2();
//
//    }
//}

//interface Rohan {
//    void test();
//
//}
//
//interface nithin {
//    void test();
//}
//
//class ram implements Rohan, nithin {
//
//
//    @Override
//    public void test() {
//        System.out.println("Interface");
//
//    }
//}
//
//public class Selenium.Ranjan {
//    public static void main(String[] args) {
//        Rohan a = new ram();
//        a.test();
//
//    }
//}

abstract class Ram
{
    abstract void Test();
    void test1()
    {
        System.out.println("Concreate method");
    }
}
public class Ranjan extends Ram{

    public void Test()
    {
        System.out.println("Implementing abstract method");
    }

    public static void main(String[] args) {

    }

}