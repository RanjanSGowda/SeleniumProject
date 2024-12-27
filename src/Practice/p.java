package Practice;

public class p {
    public static void main(String[] args) {
//        String s="radar";
//        String rev="";
////        char[] c=s.toCharArray();
//
//        for(int i=s.length()-1;i>=0;i--)
//        {
//            rev=rev+s.charAt(i);
//        }
//        System.out.println(rev);
//
//        if(s.equals(rev))
//        {
//            System.out.println("Pass");
//        }
//        else {
//            System.out.println("Fail");
//        }

//        for(int i=c.length-1;i>=0;i--)
//        {
//            System.out.print(c[i]);
//        }
//
//
//        int a=121;
//        int reverse=0;
//        int on=a;
//
//        while (a!=0)
//        {
//            int rem=a%10;
//            reverse=reverse*10+rem;
//            a=a/10;
//        }
//        System.out.println(reverse);
//        if(on==reverse)
//        {
//            System.out.println("Pass");
//        }
//        else {
//            System.out.println("Fail");
//        }
//
//        int num=5;
//        int fact=1;
//
//        for(int i=2;i<=num;i++)
//        {
//            fact=fact*i;
//        }
//        System.out.println(fact);

//       println int num=10;
//        int f=0,s=1,t;
//
//        for (int i=0;i<num;i++)
//        {
//            System.out.print(f + " ");
//            t=f+s;
//            f=s;
//            s=t;
//        }

        String s="aabbc";
        int count=1;
        char currentchar=s.charAt(0);
        StringBuilder compress=new StringBuilder();


        for(int i=1;i<s.length();i++)
        {
            if(currentchar==s.charAt(i))
            {
                count++;
            }
            else {
                compress.append(count);
                compress.append(currentchar);
                currentchar=s.charAt(i);
                count=1;

            }
        }
        compress.append(count);
        compress.append(currentchar);
        System.out.println(compress.toString());
    }
}
