package Practice;

class ExamPlan extends A{
    public static void main(String[] args) {
        System.out.println("Sample Program Output");
        A a = new A();
        a.xyz("Hello");
    }
}
class A
{
    String a="Output";
    public static void xyz(String c)
    {
        String a="Interview";
        A n = new A();
        System.out.println("the output is "+a);
    }
}