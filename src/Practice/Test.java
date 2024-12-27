package Practice;

class Ram1
{
    int a=10;
    public void test()
    { int a=12;
        System.out.println(this.a);
    }
    public void Ram()
    {
        System.out.println("This is super class constructor");
    }

}

class harsh extends Ram1{

    public void Ram()
    {
        System.out.println("This is subclass constructor");
    }
    public void test()
    {
        int a=19;
        Ram();
    }

}
public class Test extends harsh {
    public static void main(String[] args) {
        Test a=new Test();
        a.test();
    }
}
